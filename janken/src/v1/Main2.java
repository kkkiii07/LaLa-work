/**
 * 
 */
package v1;

public class Main2 {
	public static void main(String[] args) {
		String[] hand = {"グー", "チョキ", "パー"};	
		int num = new java.util.Random().nextInt(3);
		
		int user = userInput();
		
		System.out.println("わたしの手は" + hand[num] + "です");
		System.out.println("あなたの手は" + hand[user] + "です");

	}
	
	public static int userInput() {
		System.out.println("0:グー, 1:チョキ, 2:パー");
		System.out.println("数字で入力してください");
		int userInput = new java.util.Scanner(System.in).nextInt();
		return userInput;
	}

}
