package garden;

public class Main {

	public static void main(String[] args) {
//		Flower f = new Flower();
//		f.bloom();

		Flower f = new Flower("あじさい");
		f.bloom();
		
//		Rose r = new Rose();
//		r.smell();
		
		Rose r = new Rose("ばら");
		r.smell();
		r.bloom();

	}

}
