package ex05;

public class Ex5_2_1 {

	public static void main(String[] args) {
		String title = "予約をお願いします。";
		String address = "kkkiii@gmail.com";
		String text = "よろしくお願いいたします。";
		
		email(address, title, text);

	}
	
	public static void email(String address, String title, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

}
