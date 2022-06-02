package world;

public class PoisonMatango_t extends Matango_t {
	public int pcount = 5;
	public PoisonMatango_t(char suffix) {
		super(suffix);
		//PoisonMatango(char suffix)の引数を
		//親のMatango(char suffix)にセットする
	}
	
	public void attack(Hero h) {
		System.out.println("PoisonMatangoの攻撃！");
		super.attack(h);
		if (this.pcount != 0) {
			System.out.println(this.suffix + "は、さらに毒の胞子をばらまいた！");
			int damege = h.hp / 5;
			h.hp = h.hp - damege;
			System.out.println(h.name + "に" + damege + "ポイントのダメージ！");
			System.out.println(h.name + "のHP：" + h.hp);
			this.pcount--;
			System.out.println("毒攻撃の残り回数：" + this.pcount);
		}
	}
	
	
}