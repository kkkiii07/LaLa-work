package world;

public class PoisonMatango extends Matango {
	public int pcount = 5;
	public PoisonMatango(char suffix) {
		super(suffix);
		//PoisonMatango(char suffix)の引数を
		//親のMatango(char suffix)にセットする
	}
	
	public void attack(Hero h) {
		super.attack(h);
		if (pcount != 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int damege = h.hp / 5;
			h.hp = h.hp - damege;
			System.out.println(h.name + "に" + damege + "ポイントのダメージ！");
			System.out.println(h.name + "のHP：" + h.hp);
			pcount--;
			System.out.println("毒攻撃の残り回数：" + pcount);
		}
	}
	
	
}