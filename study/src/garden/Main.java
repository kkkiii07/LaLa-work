package garden;

import garden.Flower.Leaf;

public class Main {

	public static void main(String[] args) {
//		Flower f = new Flower();
//		f.bloom();

		Flower f = new Flower();
		f.bloom();
		Leaf l = f.makeLeaf();
		System.out.println(l.getName());
		
//		Rose r = new Rose();
//		r.smell();
		
		Rose r = new Rose("ばら");
		r.smell();
		r.bloom();
		
//		Leaf l = new Leaf("葉");
//		System.out.println(l.getName());

	}

}
