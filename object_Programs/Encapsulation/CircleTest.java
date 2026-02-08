package object_Programs.Encapsulation;

public class CircleTest {
	public static void main(String[] args) {
		Circle c = new Circle();

		c.setRadius(5);

		System.out.println("Area of Circle : " + Circles.computeArea(c));
		System.out.println("Diameter of Circle: " + Circles.computeDiameter(c));
		System.out.println("Perimeter of Circle : " + Circles.computePerimeter(c));

	}

}

