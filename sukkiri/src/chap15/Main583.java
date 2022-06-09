package chap15;

import java.util.Calendar;
import java.util.Date;

public class Main583 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
//		c.set(2019, 8, 22, 1, 23, 45);
		c.set(2019, 8, 22);
//		c.set(Calendar.MONTH, 9);
		Date d = c.getTime();
		//↑ Date型に変換 ミリ秒に変更している。ミリ秒に変換してDate型に入れると、日付に変換してくれる。
		System.out.println(d);
		
		Date now = new Date();
		c.setTime(now); //現在のミリ秒
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");

	}

}
