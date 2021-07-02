package co.yedam.exercise;

public class Eployee {
	// 필드(사원.)정의.
	// 사원번호
	// 이름
	// 이메일
	// 급여
	// 부서

	private int empNum;
	private String empName;
	private String empEmail;
	private int empMoney;
	private String empDepartment;

	
	public Eployee() {
		
	}
	
	
	public Eployee(int empNum, String empName, String empEmail) {
		this.empNum = empNum;
		 this.empName = empName;
		 this.empEmail = empEmail;
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public int getEmpMoney() {
		return empMoney;
	}

	public void setEmpMoney(int empMoney) {
		this.empMoney = empMoney;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	// 메소드 정의.
	// get, set
	public String showInfo() {
		String info = "[사원번호: " + empNum + "사원이름: " + empName + "이메일: " + empEmail + "급여: " + empMoney + "부서: "
				+ empDepartment + "]";
		return info;
	}

}
