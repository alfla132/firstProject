package co.yedam.pilates;

import java.util.Scanner;

public class pilatesApp {

	private static pilatesApp singleton = new pilatesApp();

	pilatesApp() {

	}

	public static pilatesApp getInstance() {
		return singleton;
	}

	// 글로벌 변수 = 필드(Field)
	static Member[] members = new Member[10];
	static Scanner scn = new Scanner(System.in);

	public void main() {
		members = new Member[] { 
				new Member(1, "Hong", "01012345678", "9132154", Gender.WOMEN),
				new Member(2, "Kim", "01012455584", "9875454", Gender.MEN),
				new Member(3, "Ha", "01015742121", "945122", Gender.WOMEN),
				new Member(4, "Lee", "010123456523", "9547612", Gender.MEN),
				new Member(5, "Bak", "01015495448", "9652105", Gender.WOMEN) };

		// 1.입력, 2.수정, 3.삭제, 4.회원리스트, 5.이름조회, 6.상세조회, 9.종료
		while (true) {
			showMenu();
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				memberAdd();
			} else if (menu == 2) {
				memberEdit();
			} else if (menu == 3) {
				memberDelete();
			} else if (menu == 4) {
				memberList();
			} else if (menu == 5) {
				searchByName();
			} else if (menu == 6) {
				memberDetail();
			} else if (menu == 9) {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");

	}// end of main

	public void memberDetail() {
		int detail = scanInt("상세조회할 회원번호를 입력하세요.");
		for (int i = 1; i < members.length; i++) {
			scn.nextLine();
			if (members[i] != null && members[i].getMemberId() == detail) {
				System.out.println("===================================");
			System.out.println(members[i].getInfo());
			System.out.println("===================================");
			} break;
		}

	}

	public void memberEdit() {

		int editId = scanInt("수정하실 회원번호를 입력하세요.");
		scn.nextLine();
		for (int i = 0; i < members.length; i++) {
			boolean exist = false;
			if (members[i] != null && members[i].getMemberId() == editId) {
				String name = scanString("수정할 이름을 입력하세요.");
				String phone = scanString("수정할 연락처를 입력하세요.");
				String birth = scanString("수정할 생일을 입력하세요.");
				if (!name.equals("")) {
					members[i].setMembername(name);
					exist = true;
				}
				if (!phone.equals("")) {
					members[i].setMemberphone(phone);
					exist = true;
				}
				if (!birth.equals("")) {
					members[i].setMemberbirth(birth);
					exist = true;
				}
				if (exist) {
					System.out.println("수정되었습니다.");
				}
			}
		}
	}

	public void memberDelete() {
		int delId = scanInt("삭제하실 회원번호를 입력하세요>> ");
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberId() == delId) {
				members[i] = null;
				System.out.println("입력하신 아이디가 삭제되었습니다. 복구하실 수 없습니다.");
				break;
			}
		}
	}

	public void searchByName() {
		String name = scanString("조회할 이름을 입력하세요>> ");
		boolean exist = false;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMembername().equals(name)) {
				System.out.println(members[i].showInfo());
				exist = true;
			}
		}
		if (!exist) {
			System.out.println("조회한 이름이 없습니다.");
		}
	}

	public void memberList() {
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) { // null이 아닌 경우만 출력...
				System.out.println(members[i].showInfo());
			}
		}
	}

	public void memberAdd() {
		String name = scanString("이름을 입력하세요>> ");
		String phone = scanString("연락처를 입력하세요>> ");
		String birth = scanString("생일을 입력하세요>> ");
		Gender gender = scanGen("성별을 입력하세요(1:남, 2:여) >>>");

		Member member = new Member(getNextId(), name, phone, birth, gender);

		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) { // 입력시 비워져 있는 곳에 입력.
				members[i] = member;
				break; // 비어있는 위치에 한건 입력 후 종료.
			}
		}
	} // add

	public String scanString(String arg) { // 입력 메세지 출력 후 문자입력값을 반환.
		System.out.println(arg);
		String val = scn.nextLine();
		return val;
	}

	public int scanInt(String arg) { // 입력 메세지 출력후 int 반환.
		int val = 0;
		while (true) {
			try {
				System.out.println(arg);
				val = scn.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("숫자만 입력 가능합니다.");
				scn.nextLine();
			}
		}
		return val;
	}

	public Gender scanGen(String arg) { // 입력 메세지 출력 후 Gender 반환.
		Gender gender = null;
		while (true) {
			try {
				System.out.println(arg);
				int gen = scn.nextInt(); // 예외가 발생하면 에러메세지 출력 후 다시 입력메세지
				if (gen == 1) {
					gender = Gender.MEN;
				} else if (gen == 2) {
					gender = Gender.WOMEN;
				} else {
					System.out.println("1 또는 2 입력하세요.");
					continue; // 반복문 탈출 못하도록...
				}
				break;
			} catch (Exception e) { // 숫자 입력해야 되는데 문자를 입력할 시 catch 구문 실행
				System.out.println("잘못 입력하셨습니다. 1 또는 2 입력하세요.");
				scn.nextLine();
			}
		}
		return gender;
	}

	public int getNextId() {
		// 회원번호 가입순번 => 1, 2, 3...
		int memberId = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) { // 현재 멤버아이디 중에서 최고번호.
				if (members[i].getMemberId() > memberId) {
					memberId = members[i].getMemberId();
				}
			}
		}
		memberId++;
		return memberId;
	}

	public void showMenu() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1.입력 | 2.수정 | 3.삭제 | 4.회원리스트 | 5.이름조회 | 6.상세조회 | 9.종료");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("선택> ");
	}
}
