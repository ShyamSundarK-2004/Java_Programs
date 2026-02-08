package java_codes_Objects_Constructors;

public class Box {

	double length;
	double width;
	double area;

	Box() {
		System.out.println("the box is getting ready..");
	}

	Box(double length) {
		this();
		this.length = length;
		System.out.println("length is iniatialized");
	}

	Box(double length, double width) {
		this(length);
		this.width = width;
		System.out.println("width is initialized");
	}

	Box(double length, double width, double area) {
		this(length, width);
		this.area = area;
		System.out.println("the area is found: " + this.area);
	}
}
