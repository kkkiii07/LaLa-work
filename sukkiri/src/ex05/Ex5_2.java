package ex05;

public class Ex5_2 {

	public static void main(String[] args) {
		String address = "kkkiii@gmail.com";
		String title = "ライブ予約";
		String text = "チケットを1枚、予約お願いします。";
		email(address, title, text);
	}
	
	public static void email(String address, String title, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

}
