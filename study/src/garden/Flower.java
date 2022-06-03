package garden;

public class Flower {
	public String name;
	
	public Flower() {
		this.name = "花";
	}
	
	//↓newした時に名前を受け取る時の方法
	//↓名前を設定したら好きな名前に変更出来る
	public Flower(String name) {
		this.name = name;
	}
	
	public void bloom() {
		System.out.println(this.name + "が咲いた。");
	}
	
//	setName(String name);
//	this.name
}
