package chap16;

import java.util.ArrayList;

public class Main612 {

	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<>(); //pointsというリストが出来た
		System.out.println("size:" + points.size());
		points.add(10);
		points.add(80);
		points.add(75);
//		System.out.println(points.remove(0));
		System.out.println("size:" + points.size()); //size:3と出る
		for (Integer i : points) {
			System.out.println(i); //10 80 75と出る
		}
		
		//オートボクシング
		//拡張for文
		for (int i : points) { //pointsはInteger型　自動的にキャストしてint型にしてる
			System.out.println(i); //10 80 75と出る
		}
//		for (int i = 0; i < points.size(); i++) {
//			System.out.println(points.get(i));
//		}
//		System.out.println(points.get(0)); //配列と同じように取得出来る
		if (points.contains(80)) {
			System.out.println("ある");
		}

	}

}
