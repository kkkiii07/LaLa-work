package ex5;

public class Ex5_1 {

	public static void main(String[] args) {
//		System.out.println("メソッド");
		introduceOneself();
	}
	
	public static void introduceOneself() {
		String name = "桃太郎";
		int age = 28;
		double height = 165;
		char zodiac = '未';
		
		System.out.println("私の名前は、剣城" + name + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("身長は" + height + "cmです。");
		System.out.println("干支は" + zodiac + "です。");
	}

}
