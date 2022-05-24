package chap05;

public class Main211 {

	public static void main(String[] args) {
		int[] x = {100, 200, 300};
		methodA(x);
		System.out.println("main:" + x[0]);
	}
	 public static void methodA(int[] arr) {
		 arr[0] = 1000;
//		 System.out.println("methodA:" + x);
	 }

}
