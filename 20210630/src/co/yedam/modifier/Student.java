package co.yedam.modifier;

class Teacher {
	private String name;
	private String major;

	Teacher() {//default 생성자 : 동일한 패키지 안에 있으면 호출 가능.
		
	}
	
	
	String getName() {//default
		return name;
	}
	
}

public class Student {
	private String name;
	private String major;
	private int grade;

	private Student() {
		// private
	}

	protected Student(String name) {
		// default
		this.name = name;

	}

	public Student(String name, String major) {
		// public
		this.name = name;
		this.major = major;
	}

}
