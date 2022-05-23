package chap04;

public class Main07 {

	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 60;
		scores[1][0] = 80;
		scores[1][1] = 60;
		scores[1][2] = 70;
//		System.out.println(scores[1][1]);
		for (int i = 0; i < scores.length; i++) {
			//scores.lengthで0と1
			for (int k = 0; k < scores[i].length; k++) {
				//scores[i].length iが0の長さで、iが1の長さ
				System.out.print(scores[i][k]);
			}
			System.out.println();
		}
	}

}
