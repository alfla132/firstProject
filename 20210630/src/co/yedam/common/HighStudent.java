package co.yedam.common;

import co.yedam.modifier.Student;

public class HighStudent extends Student {

	HighStudent(String name) {//protected는 접근 가능. default는 접근 불가능.
		super(name);
	}
	
}



//protected 는 상속의 관계일 경우 패키지가 달라도 접근가능
// default는 상속의 관계라도 패키지 다르면 접근 불가능
