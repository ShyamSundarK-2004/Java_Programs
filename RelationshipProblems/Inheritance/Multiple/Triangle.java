package april.RelationshipProblems.Inheritance.Multiple;

public class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void computeArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}
