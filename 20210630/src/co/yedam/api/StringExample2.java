package co.yedam.api;

public class StringExample2 {
	public static void main(String[] args) {
		
		String[] strAry = { "9703041234567", "970304 1234567",
		"970304-2234567", "970304-3234567", "970304 4234567"};
//		String birth1 = "9703041234567";
//		String birth2 = "970304 1234567";
//		String birth3 = "970304-2234567";
//		String birth4 = "970304-3234567";
//		String birth5 = "970304 4234567";
		
		
		for (int i = 0; i < strAry.length; i++) {
			if(strAry[i].charAt(7) == 1) {
				System.out.println("남자입니다.");
			} else if (strAry[i].charAt(7) == 2) {
				System.out.println("여자입니다.");
			} else if (strAry[i].charAt(7) == 3) {
				System.out.println("남자입니다.");
			} else if (strAry[i].charAt(7) == 4) {
				System.out.println("여자입니다.");
			} else {
				System.out.println("사람이 아닙니다.");
			}
 		} 
		
	}
	
	
	// 해결안된 문제임


	
}
