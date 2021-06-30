package co.yedam;

public class Student {
	private String name;
	private int stuNum;
	private int engGrade;
	private int mathGrade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		System.out.println("[이름: " + this.name + "학년: " + this.stuNum + "영어점수: " + this.engGrade + "수학점수: " + this.mathGrade +" ]");
	}
	
	public String getInfo() {
		return "[이름: " + this.name + "학년: " + this.stuNum + "영어점수: " + this.engGrade + "수학점수: " + this.mathGrade +" ]";
	}
	
	
	
	
}
