package co.yedam.common;

import co.yedam.modifier.Student;
import co.yedam.modifier.Teacher;

public class Example {
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.getName(); // 동일한 패키지내에서는 호출가능.

		
		Student s1 = new Student("홍길동"); //동일한 패키지 안에서 default는 호출가능.
	}
}
