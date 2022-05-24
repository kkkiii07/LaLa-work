package chap05;

	//戻り値
public class Main5_4 {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		String msg = "五郎さん、こんにちは";
		hello(msg);
		System.out.println("メソッドの呼び出しが終わりました");
		int x = 100;
		int y = 10;
		int ans = add(x, y);
		System.out.println(x + "+" + y + "=" + ans);
	}
	
	//msg→messageへと名前は違うが、メモリ上の文字列に渡している
	public static void hello(String message) {
		System.out.println(message);
	}
	//仮引数は型の指定を忘れずに
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}

}
