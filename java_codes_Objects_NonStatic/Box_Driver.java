package java_codes_Objects_NonStatic;

public class Box_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box b1 = new Box(3, 6);
		Box b2 = new Box(4, 8);

		System.out.println(b1.calculateArea());
		System.out.println(b2.calculateArea());
	}

}
