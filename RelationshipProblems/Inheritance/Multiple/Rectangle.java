package april.RelationshipProblems.Inheritance.Multiple;

public class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void computeArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
