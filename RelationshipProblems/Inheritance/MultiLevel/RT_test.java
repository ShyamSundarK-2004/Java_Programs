package april.RelationshipProblems.Inheritance.MultiLevel;

public class RT_test {

	public static void main(String[] args) {

		Shape s1 = new Shape();

		s1.computeArea();

		// s1.base; cte because we can't access the child class member
		// using parent class object

		System.out.println("=================");

		Triangle t1 = new Triangle(5, 10);

		System.out.println(t1.base);

		System.out.println(t1.height);

		t1.computeArea();

		System.out.println("=================");

		RightAngle_Triangle rt = new RightAngle_Triangle(10, 15);
		rt.computeArea();

		System.out.println(rt.base);

		System.out.println(rt.height);
	}
}
