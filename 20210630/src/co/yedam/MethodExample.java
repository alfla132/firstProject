package co.yedam;

public class MethodExample {

	public static String makeUseInfo(String str) {
		String[] info = str.split(" ");
		String name = info[0];
		String birth = info[1];
		String phone = info[2];

		name = "이름; " + name;
		birth = "\n생일: " + birth.substring(0, 4) + "년" + birth.substring(4, 6) + "월" + birth.substring(6, 8) + "일";
		phone = "\n전화: " + phone.substring(0, 3) + "-" + phone.substring(3, 7) + "-" + phone.substring(7, 11);
		String result;
		result = name; 
		result += birth;
		result += phone;

//		System.out.println("------------------------------");
//		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		// 이름: 홍길동
		// 생일: 1990년01월01일
		// 전화: 010-1234-5678
		String str1 = new String("홍길동 19900101 01012345678");
		String result = makeUseInfo(str1);
		System.out.println(result);

		String str2 = new String("유재석 19900101 01012345678");
		System.out.println(makeUseInfo(str2));

		String str3 = new String("하하 19900101 01012345678");
		makeUseInfo(str3);

		System.out.println("프로그램 종료.");
	}

} // c
