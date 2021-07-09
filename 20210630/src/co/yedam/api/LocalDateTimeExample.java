package co.yedam.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LocalDateTimeExample {
	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.format(dtf)); // LocalDateTime -> String

		// String -> LocalDateTime
		LocalDateTime anytime = LocalDateTime.parse("2021-06-13 15:00:00", dtf);
		dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH");
		anytime = LocalDateTime.parse("2021/05/01 14", dtf);
		
		System.out.println(anytime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		System.out.println(anytime.getMonth());
		System.out.println(anytime.getMonthValue() + "월");
		LocalDateTime ti = LocalDateTime.now()
				.withYear(2020).withMonth(7).withDayOfMonth(5)
				.withHour(15).withMinute(30).withSecond(25);
		System.out.println(ti.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		
		LocalDateTime yourBirth = LocalDateTime.now()
				.withYear(1995).withMonth(7).withDayOfMonth(20)
				.withHour(16).withMinute(30).withSecond(00);
		System.out.println("나의 생일: " + yourBirth.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		
//		now.format(dtf) anytime.format(dtf)
	}

}
