package chap12;

import world.Matango_t;
import world.Wand;
import world.Wizard;

public class Main471 {

	public static void main(String[] args) {
		Wand wand = new Wand("魔法の杖");
//		Wizard w = new Wizard();
		Wizard w = new Wizard(wand);
		
//		if (c instanceof Wizard) {
//			System.out.println("いいよ！");
//		}
//		
//		Wizard w = (Wizard) c;
		Matango_t m = new Matango_t();
		w.setName("アサカ");
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
