package april.RelationshipProblems.Inheritance.Multiple;

public class Shape_Test {

	public static void main(String[] args) {
		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(4, 6);
		Shape triangle = new Triangle(3, 7);

		circle.computeArea();
		rectangle.computeArea();
		triangle.computeArea();
	}
}
