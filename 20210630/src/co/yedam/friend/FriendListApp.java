package co.yedam.friend;

import java.util.Scanner;

public class FriendListApp {

	static Friend[] friends = new Friend[10];
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// 1.추가 2.리스트 3.종료
		boolean run = true;
		while (run) {
			System.out.println("=========================");
			System.out.println("1.추가 2.리스트 3.종료");
			System.out.println("=========================");
			System.out.println("선택> ");
			String selectNo = scn.next();
			switch (selectNo) {
			case "1":
				System.out.println("1.친구 2.학교친구 3.회사친구");
				String menu = scn.next();
				Friend friend = null;

				System.out.println("이름을 입력하세요>> ");
				String name = scn.next();
				System.out.println("연락처를 입력하세요>> ");
				String phone = scn.next();

				if (menu.equals("1")) {
					friend = new Friend(name, phone); // Friend 인스턴스

				} else if (menu.equals("2")) {
					System.out.println("전공명을 입력하세요>> ");
					String major = scn.next();
					friend = new UnivFriend(name, phone, major); // UnivFriend 인스턴스

				} else if (menu.equals("3")) {
					System.out.println("부서명을 입력하세요>> ");
					String department = scn.next();
					friend = new CompFriend(name, phone, department); // CompFriend 인스턴스
				}

				// 배열에 저장.
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = friend;
						break; // for 구문을 빠져나오세요
					}
				}

				break; // switch 구문을 빠져나오세요

			case "2":
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						System.out.println(friends[i].toString());
					}
				}

				break;

			case "3":
				run = false;
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}// main

}
