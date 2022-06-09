package v3;

import java.util.Scanner;

public class Game {
	
	private String msg = null;
	//フィールド変数
	//judge()の中だけで使用出来るようにしたいので、privateにした。
	
	//↓ Const.javaを使用しない場合
	private String[] hands = {"グー", "チョキ", "パー"};
	
		public void judge(Com com, User user) {
			int comHand = com.getHand();
			int userHand = user.getHand();
			
			if (userHand == comHand) {
				com.setResult("draw");
				user.setResult("draw");
				msg = "引き分けです。";
			} else if ((userHand + 1) % 3 == comHand) {
				com.setResult("lose");
				user.setResult("win");
				msg = user.getName() + "の勝ちです。";
			} else {
				com.setResult("win");
				user.setResult("lose");
				msg = com.getName() + "の勝ちです。";
		}
			
	}
		
		//↓ Const.javaを使用しない場合
		public void dispResult(Com com, User user) {
			System.out.println("ゲーム結果");
			System.out.println(com.getName() + ":" + this.hands[com.getHand()]);
			System.out.println(user.getName() + ":" + this.hands[user.getHand()]);
			System.out.println(msg);
		}
		
		public boolean isNext() {
			System.out.print("もう一度やりますか？（y/n）>");
			String yesno = new Scanner(System.in).nextLine().toLowerCase();
			// toLowerCase()で入力された文字を全て強制的に小文字にする
			if (yesno.equals("y")) {//文字の比較はequalを使用しないといけない
				return true;				
			}
			return false;
		}
		
		
//		public void dispResult(Com com, User user) {
//			System.out.println("ゲーム結果");
//			System.out.println(com.getName() + ":" + Const.hands[com.getHand()]);
//			System.out.println(user.getName() + ":" + Const.hands[user.getHand()]);
//			System.out.println(msg);
//		}
}
