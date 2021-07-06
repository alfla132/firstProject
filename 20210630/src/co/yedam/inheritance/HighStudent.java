package co.yedam.inheritance;

public class HighStudent extends Student {
	//필드.
	private String schoolName;

	//생성자. 
	public HighStudent() {
		super(); //부모클래스:
		System.out.println("HighStudent()");
	}
	
	
	public HighStudent(String name, int studNo, String schoolName) {
		super(name, studNo); // Student(String name, int studNo)
		this.schoolName = schoolName;
	}


	//메소드.
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//부모클래스가 가지고 있는 메소드를 재정의(override) 하겠습니다. 문법적 오류가 있는지 체크해 줌. 
	@Override
	public void showInfo() {
		System.out.println("이름은 " + getName() + " 학생번호는 " + getStudNo() + " 학교는 " + schoolName);
	}


	@Override
	public String toString() {
		return "HighStudent [Name()=" + getName() + ", StudNo()=" + getStudNo() + ", schoolName=" + schoolName
				+ "]";
	}


	


	
	
	
	
	
	
	
	
}
