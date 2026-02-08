package april.Threading_Concepts;

public class MainThreadClass {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Start");
		SumThread t1 = new SumThread();
		ProductThread t2 = new ProductThread();

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println("Main end");
	}
}
