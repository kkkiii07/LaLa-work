package v3;


public class Main {

	public static void main(String[] args) {
		// ↓静的フィールド
		System.out.println("NINZU:" + Const.NINZU);
//		RandomNextHand hand = new RandomNextHand();
		Com com1 = new Com(new CleverNextHand());
		com1.setName("コム1");
//		com1.setNextHand(new CleverNextHand());
		
		User user = new User(new InputNextHand());
		user.setName("サスケ");
		
		Game game = new Game();
		do {
			com1.setHand(); // ランダムに0か1か2が入る
			user.setHand(); // ユーザーが0か1か2を入れる
			game.judge(com1, user);
			game.dispResult(com1, user);
		} while (game.isNext());
		System.out.println("bye!");

	}

}
