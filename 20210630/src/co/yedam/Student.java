package co.yedam;

public class Student {
	private String name;
	private int stuNum;
	private int engGrade;
	private int mathGrade;

	public String getName() {
		return name;
	}

	public Student() { //매개값이 생성자를 기본생성자.

	}

	public int engGrade() {
		return engGrade;
	}

	public void setName(String name) { //매개값을 가지는 생성자.
		this.name = name;
	}
	
	public Student(String name, int grade) {
		this.name =name;
		this.engGrade = grade;
	}
	
	public Student(String name, int stuNum, int engGrade, int mathGrade) {
		this.name = name;
		this.stuNum = stuNum;
		this.engGrade = engGrade;
		this.mathGrade = mathGrade;
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public int getEngGrade() {
		return engGrade;
	}

	public void setEngGrade(int engGrade) {
		this.engGrade = engGrade;
	}

	public int getMathGrade() {
		return mathGrade;
	}

	public void setMathGrade(int mathGrade) {
		this.mathGrade = mathGrade;
	}

	public void showInfo() {
		System.out.println("[이름: " + this.name + "학년: " + this.stuNum + "영어점수: " + this.engGrade + "수학점수: "
				+ this.mathGrade + " ]");
	}

	public String getInfo() {
		return "[이름: " + this.name + "학년: " + this.stuNum + "영어점수: " + this.engGrade + "수학점수: " + this.mathGrade + " ]";
	}

}
