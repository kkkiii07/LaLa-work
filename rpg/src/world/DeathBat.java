package world;

public class DeathBat extends FlyingMonster {

	public DeathBat() {
		this.hp = 60;
	}
	
	public void attack() {
		System.out.println("突っつく");
	}
}
