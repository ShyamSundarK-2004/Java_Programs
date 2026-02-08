package java_codes_Objects_Static;

public class Static_method_creation {

	static void test() {
		System.out.println("hello from the static test()");
	}

	public static void main(String[] args) {
		System.out.println("main start ");
		test();// same class we can directly call the method
		Static_method_creation.test();// also by using the class name as a reference

		System.out.println("main ends");
	}

}
