package v2;

public class Main {

//	public static void main(String[] args) {
//		// 戦略クラスを選ぶ
//		NextHand nextHand = new CleverNextHand();
//		// ↑interfaceを実装したクラスを入れかけることが出来る
//		Player com1 = new Player(nextHand);
//		System.out.println("com1の次の手は " + com1.getHand() + "です。");
//		
//		NextHand nextHand2 = new RandomNextHand();
//		// ↑interfaceを実装したクラスを入れかけることが出来る
//		Player com2 = new Player(nextHand2);
//		System.out.println("com2の次の手は " + com2.getHand() + "です。");
//
//	}
	

	public static void main(String[] args) {
		// 戦略クラスを選ぶ
		Player com1 = new Player(new CleverNextHand());
		System.out.println("com1の次の手は " + com1.getHand() + "です。");
		
		Player com2 = new Player(new RandomNextHand());
		System.out.println("com2の次の手は " + com2.getHand() + "です。");

	}

}
