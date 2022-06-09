package v3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNextHand implements NextHand {

	@Override
	public int decideHand() {

		int hand = -1;
		do {
			System.out.println("手を選択してください");
			System.out.println("0:グー 1:チョキ 2:パー");
			System.out.print(" > ");
			
			//↓ P.652 例外処理
			try {
				hand = new Scanner(System.in).nextInt();
				//キーボードから1文字入れてもらった数字を返す
				//System.inのメソッドをオープンしたのでクローズしてくださいよといったエラー。
				//キーボードはクローズ出来ないのでほっておいて良いが、
				//うるさいので@SuppressWarnings("resource")を入れている。					
			} catch (InputMismatchException e) {
				//↑ eという変数でInputMismatchExceptionというエラーが起これば取得
//				e.printStackTrace();
				//↑ この行をコメントアウトしたら実行したときに表示されたエラーが消せる。
				//↑ どんなエラーが起こったか画面に表示する
				System.out.println("数字を入力してください。");
				hand = -1;
			}		
		} while (hand < 0 || hand > 2);
		return hand;
	}
	
}
