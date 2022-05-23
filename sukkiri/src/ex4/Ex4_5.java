package ex4;

public class Ex4_5 {

	public static void main(String[] args) {
		int[] numbers = new int[2];
		numbers[0] = new java.util.Random().nextInt(9) + 1;
		do {
			numbers[1] = new java.util.Random().nextInt(9) + 1;
		} while (numbers[0] == numbers[1]);
		
		
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		
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
