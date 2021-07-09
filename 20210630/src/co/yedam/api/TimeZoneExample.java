package co.yedam.api;

import java.text.MessageFormat;


public class TimeZoneExample {
	public static void main(String[] args) {

		String data = "회원ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
		System.out.println(MessageFormat.format(data, "123", "홍길동", "1234-1234"));
		
		System.out.format("회원ID: %s \n회원 이름: %s \n회원 전화: %s","123", "홍길동", "1234-1234");
		
		
		
		
		
		
		
		
		
	}
}
