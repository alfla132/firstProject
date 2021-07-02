package co.yedam.exercise;

public class Example01 {
	
	public static void main(String[] args) {
		// e1 : 사원번호 : 1234, 이름: 박주현, 이메일:bjh@email.com
		//급여: 4,500,000원, 부서: 개발부
		Eployee e1 = new Eployee();
		e1.setEmpNum(1234);
		e1.setEmpName("홍미림");
		e1.setEmpEmail("hmr@email.com");
		e1.setEmpMoney(500000000);
		e1.setEmpDepartment("개발부");
		
		
		
		Eployee e2 = new Eployee(1001, "박주현", "bhj@email.com");
		Eployee e3 = new Eployee(1002, "권가영", "gky@email.com");
		System.out.println(e1.showInfo()); //사원번호: 1234 이름: 박주현 이메일: bjh@email.com
	
		//배열 : eployees (5)
		//첫번째위치 : e1, 두번째위치: e2,
		//세번째위치 : new Eployee(1234, "임지연", "ljy@email.com", 5000000, "총무부")
		
		eployee[] eployees = { e1, e2, e3 };
	}
}
