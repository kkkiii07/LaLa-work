package garden;

public class Flower {
	private String fname;
	
	public Flower() {
		this.fname = "花";
	}
	
	//↓newした時に名前を受け取る時の方法
	//↓名前を設定したら好きな名前に変更出来る
	public Flower(String name) {
		this.fname = name;
	}
	
	public void bloom() {
		System.out.println(this.fname + "が咲いた。");
	}

	public String getName() {
		return fname;
	}

	public void setName(String name) {
		this.fname = name;
	}
	
//	setName(String name);
//	this.name
	
	// ↓内部クラス
	public Leaf makeLeaf() {
		Leaf l = new Leaf("葉");
		return l;
	}
	
	//Flowerのクラスの中に入れてみたらMain.javaでエラーが出る
	class Leaf {
		private String name;
		public Leaf(String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
	}
	
}

//Flowerのクラスに一緒に書かせていただいているだけ
//class Leaf {
//	private String name;
//	public Leaf(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return this.name;
//	}
//}
