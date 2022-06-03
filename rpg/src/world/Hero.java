package world;

public class Hero {

	private int hp;
	private String name;
	private Sword sword;
	
	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}
	
	public Hero(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	void sleep() { //publicを削除して、同じパッケージに属するクラスのみOKとした。
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した。");
	}
	
	private void die() {
		System.out.println(this.name + "は新でしまった！");
		System.out.println("GAME OVERです。");
	}
	
	public void attack(Matango_t m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("敵に5ポイントのダメージを与えた！");
		
		System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
		this.hp = this.hp - 2;
		
		if (this.hp <= 0) {
			this.die();
		}
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}
