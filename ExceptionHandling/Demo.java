package april.ExceptionHandling;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Main Start");
		try {
			m1();
		} // here the compiler checks the exception thrown to it
			// it can be any exception thrown to it
		catch (InterruptedException e) {

		}
		// this is generalized exception so i can catch all the exception
		catch (Exception e) {

		}
		System.out.println("Main End");
	}

	public static void m1() throws Exception {
		System.out.println("M1 start");
		Thread.sleep(3000);
		System.out.println("M1 end");
	}

}
