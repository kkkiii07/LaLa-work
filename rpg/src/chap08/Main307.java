package chap08;

import old.Matango_20220602;
import world.Hero;

public class Main307 {

	public static void main(String[] args) {
//		勇者と、この仮想世界に生まれよ！
		Hero h = new Hero();
		
//		h.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");
		
		Matango_20220602 m1 = new Matango_20220602();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango_20220602 m2 = new Matango_20220602();
		m2.hp = 48;
		m2.suffix = 'B';
		
//		冒険の始まり
//		h.slip();
//		m1.run();
//		m2.run();
		h.run();
		
//		お化けキノコよ、この仮想世界に生まれよ!
		
//		勇者よ、戦え！
		
//		お化けキノコよ、逃げろ！

	}

}
