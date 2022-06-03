package chap12;

import world.Character;
import world.Matango_t;
import world.Wizard;

public class Main471 {

	public static void main(String[] args) {
//		Wizard w = new Wizard();
		Character c = new Wizard();
		
		if (c instanceof Wizard) {
			System.out.println("いいよ！");
		}
		
		Wizard w = (Wizard) c;
		Matango_t m = new Matango_t();
		w.name = "アサカ";
		w.attack(m);
		w.fireball(m);
		
		//↓cの中身はHeroではないので実行されない
//		if (c instanceof Hero) {
//			Hero h = (Hero) c; //(Hero) cの(Hero)はキャスト演算子
//			h.attack(m);
//		} else {
//			System.out.println("cのインスタンスはHeroではない");
//		}
	}

}
