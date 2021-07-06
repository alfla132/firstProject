package co.yedam.inheritance;

public class StudentExample {
	public static void main(String[] args) {
		Student std = new Student();
		std.setName("학생1");
		std.setStudNo(100);
//		System.out.println("Student: " + std.getName() + ", " + std.getStudNo());

		HighStudent highStd = new HighStudent();
		highStd.setName("고등학생1");
		highStd.setStudNo(1001);
		highStd.setSchoolName("성서고등학교");
//		System.out.println(
//				"HighStudent: " + highStd.getName() + ", " + highStd.getStudNo() + ", " + highStd.getSchoolName());

		Student[] students = new Student[3];
		students[0] = std;
		students[1] = highStd;

		students[0].getName();
		students[0].getStudNo();
		if (students[0] instanceof HighStudent) { // students[0] 의 인스턴스가 HighStudent의 것이 맞는지 확인하고 아니면 실행하지 마십시오.
			HighStudent hsx = (HighStudent) students[0];
			hsx.getSchoolName(); // 문법상으론 오류가 없음. 실행하면서 오류가 남.
		}
		students[0].showInfo();
		System.out.println(students[0].toString());
		
		students[1].getName();
		students[1].getStudNo();
//		students[1].getSchoolName();
		if (students[0] instanceof HighStudent) {
			HighStudent hs = (HighStudent) students[1];
			hs.getSchoolName(); // 실행가능.
		}
		students[1].showInfo();
		System.out.println(students[1].toString());
		

//		int <-- byte;
//		byte <-- (byte) int;

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
