package world;

public class Dancer extends Character {
	public Dancer() {
		this.name = "ダンサー";
	}
	
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った。");
	}
	
	public void attack(Matango_t m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ。");
		m.hp = m.hp - 3;
	}
}
