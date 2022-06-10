package ex15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main15_5 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		LocalDate future = now.plusDays(100);
		System.out.println(future);
		DateTimeformatter dtf = DateTimeFormatter.ofPattern("西暦yyy年MM月dd日");
		System.out.println(future.format(dtf));

		

	}

}
