package co.yedam.friend;

public class CompFriend extends Friend {

	// 필드.
	private String department;
	
	// 생성자.
	public CompFriend(String name, String phone, String department) {
		super(name, phone);
		this.department = department;
	}

	// 메소드.
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "CompFriend [Name = " + getName() + ", Phone = " + getPhone() + ", department = " + department + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
