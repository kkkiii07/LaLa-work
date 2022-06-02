package chap11;

import world.Hero;
import world.SuperHero;

public class Main433 {

	public static void main(String[] args) {
		/*
		Goblin goblin = new Goblin();
//		goblin.hp = 100;
//		goblin.mp = 10;
		goblin.attack();
		goblin.run();
		System.out.println("hp:" + goblin.hp);
		System.out.println("mp:" + goblin.mp);
		
		Werewolf werewolf = new Werewolf();
//		werewolf.hp = 80;
//		werewolf.mp = 20;
		werewolf.attack();
		werewolf.run();
		System.out.println("hp:" + werewolf.hp);
		System.out.println("mp:" + werewolf.mp);
		
		DeathBat deathBat = new DeathBat();
//		deathBat.hp = 80;
//		deathBat.mp = 20;
		deathBat.attack();
		deathBat.run();
		System.out.println("hp:" + deathBat.hp);
		System.out.println("mp:" + deathBat.mp);
		*/
		
		Hero h = new Hero("田中");
		h.sleep();
		
		SuperHero sh = new SuperHero("まえだ");
		sh.sleep();

	}

}
