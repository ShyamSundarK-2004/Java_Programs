package object_Programs.Encapsulation;

public class Circles {

	public static double computeDiameter(Circle c) {
		double diameter = c.getRadius() * 2;
		return diameter;
	}

	public static double computeArea(Circle c) {
		double area = c.getRadius() * c.getRadius() * 3.14;
		return area;
	}

	public static double computePerimeter(Circle c) {

		double perimeter = 2 * 3.14 * c.getRadius();
		return perimeter;

	}

}
