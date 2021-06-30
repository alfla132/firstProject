package co.yedam;

public class Person {
	// 이름, 나이, 키, 혈액형(bloodType != bloodtype

	private String name;
	private int age;
	private double height;
	private String bloodType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public void showInfo() {
		System.out.println("[이름: " + this.name + "나이: " + this.age + "키: " + this.height + "혈액형: " + this.bloodType +" ]");
	}
	
	public String getInfo() {
		return "[이름: " + this.name + "나이: " + this.age + "키: " + this.height + "혈액형: " + this.bloodType +" ]";
	}
}
