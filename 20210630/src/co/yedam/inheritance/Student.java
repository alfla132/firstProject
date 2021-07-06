package co.yedam.inheritance;

public class Student extends Object {
	//필드.
	private String name;
	private int studNo;
	
	//생성자.
	public Student() {
		System.out.println("Student() call.");
	}
	
	
	public Student(String name, int studNo) {
		super(); //Object 클래스를 상속받는 클래스.
		this.name = name;
		this.studNo = studNo;
	}



	//메소드.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudNo() {
		return studNo;
	}
	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}
	
	
	public void showInfo() {
		System.out.println("이름은 " + name + " 학생번호는 " + studNo);
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", studNo=" + studNo + "]";
//		return super.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
}
