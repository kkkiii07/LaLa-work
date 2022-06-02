package old;

public class SuperHero_20220531 {
	String name = "ミナト";
	int hp = 100;
	boolean flying;
	
	public void attack(Matango_20220602 m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	
	public void run() {
		System.out.println(this.name + "は撤退した");
	}
}
