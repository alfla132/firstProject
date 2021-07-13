package co.duchi.prj;

public class IfTest {

	public void simpleIf() {
		int a = 10;
		if (a > 10) {
			System.out.println("a가 10보다 큰 수");
		}

		System.out.println("단순 비교문 종료");
	}

	public void ifElseTest() {
		int a = 10;
		if (a > 10) {
			System.out.println("a는 10보다 큰 수");
		} else {
			System.out.println("a는 10보다 같거나 작다.");
		}
	}

	public void ifElseIf() {
		int a = 10;
		if (a > 10) {
			System.out.println("a는 10보다 큰 수");
		} else if (a == 10) {
			System.out.println("a는 10과 같다");
		} else {
			System.out.println("a는 10보다 작다.");
		}
	}
}
