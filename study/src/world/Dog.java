package world;

public class Dog extends Animal {
	public void roar() {
		System.out.println(this.getName() + "は吠えた。");
		System.out.println("hpが1減った。");
//		this.hp = this.getHp() - 1;
		this.setHp(this.getHp() - 1);
	}
}
