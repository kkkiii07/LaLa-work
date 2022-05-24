package chap05;

public class Main210 {

	public static void main(String[] args) {
		int x = 100;
		methodA(x);
		System.out.println("main:" + x);
	}
	 public static void methodA(int x) {
		 x = 1000;
		 System.out.println("methodA:" + x);
	 }

}
