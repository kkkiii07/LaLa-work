package old;

import world.Hero;

public class Matango_20220602 {
	public int hp = 50;
	public char suffix;
	
	public Matango_20220602() {this.suffix = 'A';}
	
	public Matango_20220602(char suffix) {
		this.suffix = suffix;
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println(h.name + "に10のダメージを与えた。");
		h.hp = h.hp - 10;
		System.out.println(h.name + "のhpは：" + h.hp);
	}
	
}
