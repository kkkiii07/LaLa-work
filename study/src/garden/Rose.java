package garden;

public class Rose extends Flower {
	// このフィールドを有効にすると、smell()は、このフィールドを参照する。
	// したがって、null となる。
	// しかし、このままだと、親クラスのフィールドを参照する。
	// したがって、花 となる。
	
//	 public String name;
	 //↑親クラスのフィールドをオーバーライドしていることとなるので、
	 //↑フィールドをオーバーライドしてはいけない
	
	public Rose() {} //名前を与えなかったら、何も表示しない
	public Rose(String name) {
		super(name); //privateの時this.name = name;が使えないのでsuperを使用
//		this.name = name;
	}

	public void smell () {
		System.out.println(this.getName() + "はいい香りがする。");
		//this.getName()で親の名前を見に行く
	}
}
