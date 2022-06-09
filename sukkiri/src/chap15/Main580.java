package chap15;

import java.util.Date; //java.utilをインポートする

public class Main580 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		
		Date past = new Date(1600705425827L); //1600705425827は「2020年9月22日 1時23分45秒」
//		@SuppressWarnings("deprecation")
//		Date past = new Date(2020, 7, 7);
		System.out.println(past);
		

	}

}
