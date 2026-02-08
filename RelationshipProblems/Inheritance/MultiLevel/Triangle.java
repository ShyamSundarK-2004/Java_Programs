package april.RelationshipProblems.Inheritance.MultiLevel;

public class Triangle extends Shape {

	double base;
	double height;

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	void display() {

		System.out.println(base);
		System.out.println(height);

	}

}
