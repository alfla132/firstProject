package co.duchi.prj;

public class HelloJava {
	private String str;
	
	public HelloJava() {
		// 기본생성자.
	}
	
	public HelloJava(String str) { //생성자 오버로딩
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	@Override
	public String toString() { //Object 객체로 상속받은 toString 메소드를 재정의함.
		System.out.println(str);
		return null;
	}
}
