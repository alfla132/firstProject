package co.duchi.prj;

import java.util.Scanner;

public class MenuTest {
	private Scanner sc = new Scanner(System.in);
	
	private void menuTitle() {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("| 1.학생목록 조회 |");
		System.out.println("| 2.학생정보 조회 |");
		System.out.println("| 3.학생정보 등록 |");
		System.out.println("| 4.학생정보 수정 |");
		System.out.println("| 5.학생정보 삭제 |");
		System.out.println("| 6.시스템을 종료 |");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("원하는 작업을 입력하세요 >>");
	}

	private void menuRun() { 
		boolean b = true;
		int choice;
		do {
			menuTitle();
			switch(choice=sc.nextInt()) {
			case 1 :
				studentSelectList();
				break;
			case 2 :
				studentSelect();
				break;
			case 3 :
				studentInsert();
				break;
			case 4 :
				studentUpdate();
				break;
			case 5 :
				studentDelete();
				break;
			case 6 : 
				System.out.println("시스템을 종료합니다.");
				b = false;
				break;
				
			}
		} while(b);
	}

	private void studentSelectList() {
		// TODO 학생전체 목록 조회
		System.out.println("학생 전체 목록입니다.");
		
	}

	private void studentSelect() {
		// TODO 학생 한명 정보조회
		System.out.println("검색할 학생의 학번을 입력하세요");
		String id = sc.next();
		System.out.println(id + "님의 정보를 조회했습니다.");
		
	}

	private void studentInsert() {
		// TODO 새로운 학생 추가
		String id;
		int age;
		String name;
		
		System.out.println("추가할 학생의 학번을 입력하세요");
		id = sc.next(); sc.nextLine();
		System.out.println("추가할 학생의 이름을 입력하세요");
		name = sc.next(); sc.nextLine();
		System.out.println("학생의 나이를 입력하세요");
		age = sc.nextInt();
		
		System.out.println(id + " : " + name + " : " + age + "정보를 입력하였습니다.");
		
	}

	private void studentUpdate() {
		// TODO 학생정보 수정
		studentSelect(); //정보조회 후 
		// 수정할 정보 입력
		System.out.println("홍길동군의 정보를 수정했습니다.");
		
	}

	private void studentDelete() {
		// TODO 학생정보 삭제
		System.out.println("삭제할 학생의 학번을 입력하세요");
		String id = sc.next();
		System.out.println(id + "님을 삭제 완료");
	}

	public void run() {
		menuRun(); //메뉴를 시작한다.
		sc.close();
	}

}
