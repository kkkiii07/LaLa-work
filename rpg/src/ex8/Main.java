package ex8;

import world.Cleric_t;

public class Main {

	public static void main(String[] args) {
		Cleric_t cleric_t = new Cleric_t();
		//Cleric型　変数は型と同じ名前にする
		//クラスを作る時はnewする Cleric()のインスタンスを作る
		cleric_t.selfAid();
		cleric_t.pray(5);
		

	}

}
