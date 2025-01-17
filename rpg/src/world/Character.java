package world;

public abstract class Character {
	public String name;
	public int hp;
	
	public Character() {}
	
	public Character(String name) {
		this.name = name;
	}

//	public void fireball(Matango_t m) {
//		System.out.println(this.name + "は火を出した！");
//	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した。");
	}
	
	public abstract void attack(Matango_t m);
	
	public void sleep() {
		System.out.println(this.name + "は眠った。");
		System.out.println("hpは10ポイント回復した。");
		this.hp = this.hp + 10;
	}
}
