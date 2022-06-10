package ex05;

public class Ex5_4 {

	public static void main(String[] args) {
		double x = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積は" + x + "平方cmです。");
		
		double y = calcCircleArea(5.0);
		System.out.println("円の面積は" + y + "平方cmです。");

	}
	
	public static double calcTriangleArea(double bottom, double height) {
		double triangle = (bottom * height) / 2;
		return triangle;
	}
	
	public static double calcCircleArea(double radius) {
		double circle = (radius * radius) * 3.14;
		return circle;
	}

}
