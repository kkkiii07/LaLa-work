package ex05;

public class Ex5_3 {

	public static void main(String[] args) {
		String address = "kkkiii@gmail.com";
		String title = "ライブ予約";
		String text = "チケットを1枚、予約お願いします。";
		email(address, title, text);
		
		String address2 = "ggghhh@gmail.com";
		String text2 = "お疲れさまです。";
		email(address2, text2);
	}
	
	public static void email(String address, String title, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	public static void email(String address, String text) {

		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：無名");
		System.out.println("本文：" + text);
	}

}
