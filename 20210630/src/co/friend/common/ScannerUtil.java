package co.friend.common;

import java.util.Scanner;

import co.friend.model.Friend;

public class ScannerUtil {
	static Scanner scn = new Scanner(System.in);
	
	//구분,이름,전화
	public static Friend readFriend() {
		System.out.println("구분,이름,전화 ");
		String input = scn.next();
		String[] inputs = input.split(",");
		return new Friend(inputs[0], inputs[1], inputs[2]);
	}

	// 사용자의 입력 메세지 -> 숫자, 문자
	public static String readString(String prompt) {
		System.out.print(prompt);

		return readString();
	}

	public static String readString() {
		String msg = null;
		try {
			msg = scn.nextLine();
		} catch (Exception e) {
			System.out.println("관리자에게 문의하세요.");
		}
		return msg;
	}

	public static int readInt(String prompt) {
		System.out.print(prompt);
		int menu = readInt();
		return menu;
	}

	public static int readInt() {
		int val = 0;
		while (true) {
			try {
				val = scn.nextInt(); //
				scn.nextLine();
				break;
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
				scn.nextLine();
			}
		}
		return val;
	}
}
