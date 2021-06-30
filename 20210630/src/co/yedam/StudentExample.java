package co.yedam;

public class StudentExample {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("짱구");
		s1.setStuNum(1);
		s1.setEngGrade(90);
		s1.setMathGrade(80);

		Student s2 = new Student();
		s2.setName("철수");
		s2.setStuNum(2);
		s2.setEngGrade(70);
		s2.setMathGrade(88);

		Student s3 = new Student();
		s3.setName("맹구");
		s3.setStuNum(3);
		s3.setEngGrade(99);
		s3.setMathGrade(90);

		Student[] students = { s1, s2, s3 };
		int maxValue = 0;
		String name = "";

		Student maxStudent = null;
		for (int i = 0; i < students.length; i++) {
			if (maxValue < students[i].getEngGrade()) {
				maxValue = students[i].getEngGrade();
				maxStudent = students[i];
			}
		}
		System.out.println("최고영어점수:" + maxStudent.getEngGrade() + " 이름:" + maxStudent.getName() + " 수학:"
				+ maxStudent.getMathGrade());
		int mathSum = 0;
		int engSum = 0;
		double mathAvg = 0;
		double engAvg = 0;
		for (int j = 0; j < students.length; j++) {
			mathSum = mathSum + students[j].getMathGrade();
			mathAvg = mathSum / students.length;
			engSum = engSum + students[j].getEngGrade();
			engAvg = engSum / students.length;
		}
		System.out.println("수학평균: " + mathAvg);
		System.out.println("영어평균: " + engAvg);

	}
}