package chap15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main585_t {

	public static void main(String[] args) throws Exception {
//		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		
//		Date d = f.parse("2020/09/22 01:23:45");
		Date d = f.parse("2025/05/01");
		System.out.println(d);
		
		Date now = new Date();
		long milis = d.getTime() - now.getTime();
		System.out.println(milis);
		int day = ((int)milis) / (24*60*60*1000);
//		String s = f.format(l);
		System.out.println(day);
	}

}
