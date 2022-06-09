package v3;

public abstract class Player {
	private String name;
	private int hand;
	private String result;
	
	//次の手を決める戦略の型（インターフェース）
//	private NextHand nextHand = new RamdomNextHand();
// ↑多態性　ざっくり newさえすればどんなインスタンスでも入れれる。
	private NextHand nextHand; //NextHandのインターフェースの事
	
	public Player(NextHand nextHand) { //コンストラクタ
		this.nextHand = nextHand;
	}
	
	// ↓P.529に掲載
	public String toString() {
		return this.name + ":" + this.hand + ":" + this.result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHand() {
		return hand;
	}

	public void setHand() {
		this.hand = this.nextHand.decideHand(); //ランダムに0か1か2が入る
		//this.nextHandは14行目のthis.nextHand = nextHand;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public NextHand getNextHand() {
		return nextHand;
	}

	public void setNextHand(NextHand nextHand) {
		this.nextHand = nextHand;
	}
}
