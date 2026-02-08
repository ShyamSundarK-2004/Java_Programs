package java_codes_Objects_Static;

public class DriverClass {

	public static void main(String[] args) {
		// to use the static method from the static_method_creation class in this class

		// inside main we can call by using the class name as reference

		System.out.println("hello from driver class");
		Static_method_creation.test(); // this is the test method in the different class
		Static_method_creation.main(args);// this is a main method in different class
		// we can call the static method in same class as well as difference class with
		// classname as reference
	}

}
