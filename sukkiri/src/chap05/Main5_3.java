package chap05;

//クラス変数の方法
public class Main5_3 {
	static int x;
	static int y;

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		String msg = "五郎さん、こんにちは";
		hello(msg);
		System.out.println("メソッドの呼び出しが終わりました");
		x = 100;
		y = 10;
		add();
	}
	
	//msg→messageへと名前は違うが、メモリ上の文字列に渡している
	public static void hello(String message) {
		System.out.println(message);
	}
	//仮引数は型の指定を忘れずに
	public static void add() {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}

}
