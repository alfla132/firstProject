package mirim.test;

public class Sum {
	public static void main(String[] args) {
		int i = 1000;
		while(i >= 1) {
			System.out.println(i);
			i--;
			if (i == 0) { 
				System.out.println("프로그램을 종료합니다.");
			break;
			}
		}
	}
}
