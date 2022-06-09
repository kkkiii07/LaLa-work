package chap15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main585 {

	public static void main(String[] args) throws Exception {
//		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		
//		Date d = f.parse("2020/09/22 01:23:45");
		Date d = f.parse("2020/09/22 01:23");
		System.out.println(d);
		
		Date now = new Date();
		String s = f.format(now);
		System.out.println("現在は" + s + "です");
	}

}
