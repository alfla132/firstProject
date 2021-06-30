package referece;

public class ArrayExample6 {
	public static void main(String[] args) {
		// 배열을 선언. 학생의 점수 scores
		// 평균점수와 가장 높은 점수를 구하는 것.

		int[] scores = new int[3]; // { 0, 0, 0 };
		scores = new int[5];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = (int) (Math.random() * 40) + 61;
		}

		int sum = 0;
		double avg = 0.0;
		int maxValue = 0;
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];

			if (maxValue < scores[i]) {
				maxValue = scores[i];
			}
		}
		avg = (double) sum / scores.length;

		System.out.println("평균은 " + avg + "입니다.");
		System.out.println("최고점수는 " + maxValue + "입니다.");
	}
}
