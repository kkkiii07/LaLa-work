package chap04;

public class Main7_2 {

	public static void main(String[] args) {
		int[][] scores = {
				{40, 50, 60},
				{80, 60, 70}
		};
		//↑は、配列のリテラル表記という
		
		for (int i = 0; i < scores.length; i++) {
			for (int k = 0; k < scores[i].length; k++) {
				System.out.print(scores[i][k]);
			}
			System.out.println();
		}
	}

}
