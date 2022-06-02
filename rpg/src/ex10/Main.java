package ex10;

import world.Hero;
import world.PoisonMatango_t;

public class Main {

	public static void main(String[] args) {
		PoisonMatango_t pm = new PoisonMatango_t('X');
		
		Hero h = new Hero("ささき");
		pm.attack(h);
		
//		SuperHero sh = new SuperHero("スッパマン");
//		pm.attack(sh);

//		h.attack(pm);
//		sh.attack(pm);
	}

}
