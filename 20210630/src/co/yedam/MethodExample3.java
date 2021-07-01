package co.yedam;

public class MethodExample3 {
	public static void main(String[] args) {

		Student s1 = new Student("홍미림", 1, 90, 80);
		Student s2 = new Student("곽철용", 2, 70, 65);

		Student[] javaClass = { s1, s2, new Student("고은아", 3, 80, 90) };
//		s1.setName("홍미림");
//		s1.setStuNum(0);
//		s1.setMathGrade(0);
//		s1.setEngGrade(0);

		System.out.println("2학년 리스트.");
		for (int i = 0; i < javaClass.length; i++) {
			if (javaClass[i].getStuNum() == 2) {
				System.out.println(javaClass[i].getName() + "," + javaClass[i].getEngGrade() + ","
						+ javaClass[i].getMathGrade() + "," + javaClass[i].getStuNum());
			}
		}
		System.out.println(s1.getInfo());
		System.out.println(s2.getInfo());
	}
}
