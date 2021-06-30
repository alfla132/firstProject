package referece;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 : 2.점수입력 : 3.점수리스트 : 4.분석 : 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				System.out.println("학생수>");
				studentNum = scn.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				System.out.println("점수를 입력하세요.");
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: ");

					int temp = scn.nextInt();
					if (temp > 100) {
						System.out.println("입력하실 수 없습니다.");
						i--;
					} else if (temp <= 100) {
						scores[i] = temp;
					}
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]" + scores[i]);
				}

			} else if (selectNo == 4) {
				int sum = 0;
				int maxValue = 0;
				double avg = 0.0;
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]의 값: " + scores[i]);
					sum = sum + scores[i];
					// maxValue 에 배열의 각 요소와 비교 후 큰 값을 maxValue에 대입.
					if (maxValue < scores[i]) {
						maxValue = scores[i];
					}
					avg = (double) sum / scores.length;
				}
				System.out.println("합계: " + sum);
				System.out.println("가장 큰 값: " + maxValue);
				System.out.println("평균은 " + avg + "입니다.");

			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");
	}

}
