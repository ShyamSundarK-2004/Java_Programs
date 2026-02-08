package april.ExceptionHandling;

public class SampleDemo {
	public static void main(String[] args) {
		System.out.println("main start");
		try {
			m1();
		} catch (ArithmeticException e) {
			System.out.println("Handled");
		}
		System.out.println("main end");
	}

	public static void m1() {
		System.out.println("m1 start");
		System.out.println(10 / 0);
		System.out.println("m1 end");
	}
}
