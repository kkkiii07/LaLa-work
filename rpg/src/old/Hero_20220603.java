package old;

import world.Character;
import world.Matango_t;

public class Hero_20220603 extends Character {
//	public String name = "ミナト";
//	public String name;
	public int hp = 100;
	
	public Hero_20220603() {
		System.out.println("Heroのコンストラクタが動作");
	}
	public Hero_20220603(String name) {
//		this.name = name;
		super(name);
	}
	public void attack(Matango_t m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("敵に5ポイントのダメージを与えた！");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}
