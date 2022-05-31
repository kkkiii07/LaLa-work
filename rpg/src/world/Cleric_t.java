package world;

import java.util.Random;

public class Cleric_t {
	String name;
	int hp = 50;
	final int HP_MAX = 50; //定数フィールドなので定数都」なるので大文字
	int mp = 10;
	final int MP_MAX = 10; //定数フィールドなので定数都」なるので大文字
	
	public void selfAid() {
		//引数があれば()の中に引数を書く
		//戻り値はないので「void」と記入
//		this.mp -= 5;
		this.mp = this.mp - 5;
//		this.hp = this.HP_MAX;
		this.hp = HP_MAX; //最大MAXまで回復するのでこのように記載
		//定数に関してはthisにする必要がない
		System.out.println("聖職者は「セルフエイド」という魔法を使った。");
		System.out.println("HPが最大値(50)まで回復した。");
		System.out.println("mpを5使った。");
	}
	
	/**
	 * 聖職者は祈ることで自分のMPを回復出来る。
	 * 回復量は祈る秒数+ランダム(3未満)
	 * ただし、最大MPを超えることはない
	 * @param sec int 祈る秒数
	 * @return int 回復量
	 */
	public int pray(int sec) {
		//引数に「祈る秒数」を指定とあるので　int sec とした
		//戻り値として「実際に回復したMPの量」とあるのでint型を返す
		
		
		int hosei = new Random().nextInt(3); //0～2ポイントなので3を指定
		int kaifuku = sec + hosei; //祈ったら秒数 + 回復量
		if ((this.mp + kaifuku) > MP_MAX) { //最大MPより回復することはない
			kaifuku = MP_MAX - this.mp;
		}
		this.mp = this.mp + kaifuku;
		System.out.println("聖職者は" + sec + "秒祈った");
		System.out.println("MPが" + kaifuku + "回復した。");
		return kaifuku;
		
	}
	
}
