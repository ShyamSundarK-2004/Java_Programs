package java_codes_Objects;

public class Object_Creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1;
		b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		System.out.println(new Book());
//		System.out.println(b1.a + " " + b1.s);
		b1.demo(5);
		System.out.println(b1 + " , " + b2 + " , " + b3);

	}

}

class Book {
	int a = 0;
//	String s = "shyam";

	public void demo(int a) {
		System.out.println("hello from the book class method demo " + a);
	}
}
