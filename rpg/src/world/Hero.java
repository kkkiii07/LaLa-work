package world;

public class Hero {
	//↓このエリアを「フィールド」と言う
	public String name; //nullが入る
	public int hp; //初期値として0が入る
	
	public void attack() {}
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	public void sit(int sec) {
//		this.hp += sec;
		this.hp = this.hp + sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	public void slip() {
//		this.hp -= 5;
		this.hp = this.hp - 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}