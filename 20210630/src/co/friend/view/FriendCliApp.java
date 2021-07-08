package co.friend.view;

import java.util.List;

import co.friend.access.FriendAccess;
import co.friend.access.FriendList;
import co.friend.common.ScannerUtil;
import co.friend.model.Friend;

// 화면에 정보를 보여주고 사용자의 입력에 따라.. 처리해줘야 함.

public class FriendCliApp {

	FriendAccess service = new FriendList();

	public void start() {
		// 1.입력 2.수정 3.삭제 4.리스트 5.이름조회 6.전화번호조회 9.종료
		int menu = 0;
		do {
			menuTitle();
			menu = ScannerUtil.readInt("선택> ");
			switch (menu) {
			case 1: // 입력
				insert();
				break;
			case 2: // 수정
				update();
				break;
			case 3: // 삭제
				delete();
				break;
			case 4: // 리스트
				list();
				break;
			case 5: // 이름조회
				searchName();
				break;
			case 6: // 전화번호조회
				searchTel();
				break;
			case 9: // 종료
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		} while (menu != 9);
		
	}

	public void insert() {
		Friend friend = ScannerUtil.readFriend();
		service.insert(friend);
	}

	public void update() {
		// 이름입력>
		// 연락처입력>
		String name = ScannerUtil.readString("이름입력> ");
		String tel = ScannerUtil.readString("연락처입력> ");
		Friend friend = new Friend("", name, tel);
		service.update(friend);
	}

	public void delete() {
		String name = ScannerUtil.readString("이름입력> ");
		service.delete(name);
	}

	public void list() {
		List<Friend> friendList = service.selectAll();
		boolean exist = false;
		for (Friend friend : friendList) {
			if (friend != null) {
				System.out.println(friend.toString());
				exist = true;
			}
		}
		if (!exist) {
			System.out.println("데이터가 없습니다.");
		}
	}

	public void searchName() {
		
		String name = ScannerUtil.readString("이름입력> ");
		Friend f = service.selectOne(name);
		if(f == null) {
			System.out.println("찾는 데이터가 없습니다.");
		} else {
			System.out.println(f);
		}

	}

	public void searchTel() {
		String tel = ScannerUtil.readString("연락처입력> ");
		Friend t = service.findTel(tel);
		if(t == null) {
			System.out.println("찾는 데이터가 없습니다.");
		} else {
			System.out.println(t);
		}
	}

	public void menuTitle() {
		System.out.println("=== 친구 관리 ===");
		System.out.println("| 1. 친구추가   |");
		System.out.println("| 2. 친구수정   |");
		System.out.println("| 3. 친구삭제   |");
		System.out.println("| 4. 전체조회   |");
		System.out.println("| 5. 이름조회   |");
		System.out.println("| 6. 전화조회   |");
		System.out.println("| 9. 종료      |");
		System.out.println("===============");
	}

}
