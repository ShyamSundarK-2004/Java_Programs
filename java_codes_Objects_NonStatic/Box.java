package java_codes_Objects_NonStatic;

public class Box {

	double length;
	double width;

	Box(int length, int width) {
		this.length = length;
		this.width = width;
	}

	double calculateArea() {
		return length * width;
	}

}
