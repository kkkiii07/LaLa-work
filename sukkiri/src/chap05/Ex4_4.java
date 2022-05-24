package chap05;

public class Ex4_4 {
	
	public static void main(String[] args) {
		int[] nums = new int[2]; //配列には0が入っている
		junbi(nums);
		int user = input();
		hantei(nums, user);

	}
	//準備メソッド
	public static void junbi(int[] numbers) {

			numbers[0] = new java.util.Random().nextInt(9) + 1;
		do {
			numbers[1] = new java.util.Random().nextInt(9) + 1;
		} while (numbers[0] == numbers[1]);
		//メモリ上の配列の値を直接書き換えているのでreturnはいらない
		//配列はアドレス渡し
	}
	
	//準備ユーザー入力メソッド
	public static int input() {
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		return input;
	}
	
	//判定メソッド
	public static void hantei(int[] numbers, int input) {
		for (int num : numbers) {
			if (num == input) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("ハズレ！");
			}
		}
	}

}
