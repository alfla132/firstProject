package co.duchi.prj;

public class ForTest {
	public void singleFor() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("100까지 합의 결과는  = " + sum);
	}

	public void doubleFor() {
		for (int dan = 2; dan <= 19; dan++) {
			System.out.println("=========  " + dan + "단" + "  =========");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		}
	}

	public void forEach() {
		int arr[] = { 1, 4, 2, 3, 7, 5, 9 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ==for문 출력");
		}

		for (int num : arr) {
			System.out.println(num);
		}
	}
}

// 모든 class는 main() 만들지 않는다
// main()는 MainApp Class에만 만든다
// project 내에서 MainApp는 하나만 존재한다
// class 안에 class는 만들지 않는다
