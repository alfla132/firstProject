package co.yedam;

public class Person {
	// 이름, 나이, 키, 혈액형(bloodType != bloodtype)

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
	
	public int getSum(int n1, int n2) {
		return n1 + n2;
	}
	
	// 10~20의 임의의 값을 생성해주는 메소드.
	public int getFrom10To20() {
		return (int) (Math.random() * 10) + 10;
	}
	
	public int getFromTo(int n1, int n2) {
		return (int) (Math.random() * n2 - n1) + n1;
	}
	
	//매개값으로 문자(이름), 숫자(나이) => 제 이름은 ?? 이고 나이는 ??입니다.
	public String getNameAndAge(String name, int age) {
		return "이름은" + name + "이고, 나이는" + age + "입니다";
		
	}
	public Person creatNewPerson(String name, int age) {
		Person psn = new Person();
		psn.setName(name);
		psn.setAge(age);
		
		
		return psn;
	}
	
	public Person anotherNewPerson(String name, int age, double height) {
		Person pss = new Person();
		pss.setName(name);
		pss.setAge(age);
		pss.setHeight(height);
		
		
		return pss;
	}
	
	
	
	public Person theOtherNewPerson(String name, int age, double height, String bloodType) {
		Person psg = new Person();
		psg.setName(name);
		psg.setAge(age);
		psg.setHeight(height);
		psg.setBloodType(bloodType);
		
		return psg;
	}
	
	
	
	
	
	
	
	
	
}
