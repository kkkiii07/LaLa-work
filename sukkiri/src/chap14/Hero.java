package chap14;

public class Hero {
	public String name;
	public int hp;
	public static int money;
	
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
	}
	
	
	
	
	
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Hero) {
			// o instanceof Heroの oは変数 Heroは型 --> キャスト演算子
			// objectがHero型であれば
			Hero h = (Hero) o;
			// object型をHero型に戻す
			if (this.name.equals(h.name)) {
			// 名前を比べている
				return true;
			}
		}
		return false;
	}

}
