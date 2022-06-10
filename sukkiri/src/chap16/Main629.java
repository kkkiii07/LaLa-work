package chap16;

import java.util.HashSet;
import java.util.Set;

public class Main629 {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");
		System.out.println("色は" + colors.size() + "種類");
		//size()でListの要素数を調べる
		//色は3種類と出る
		
		for (String color : colors) {
			System.out.println(colors);
		}
	}

}
