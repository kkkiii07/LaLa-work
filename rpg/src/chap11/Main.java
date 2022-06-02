/**
 * 
 */
package chap11;

import world.Dancer;
import world.Hero;
import world.Matango_t;

/**
 * @author user
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Matango_t m = new Matango_t('A');
		Dancer dancer = new Dancer();
		dancer.attack(m);
		dancer.run();
		dancer.sleep();
		
		Hero hero = new Hero("マシリト");
		hero.attack(m);
		hero.run();
		
	}

}
