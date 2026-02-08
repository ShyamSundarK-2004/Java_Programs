package april.Threading_Concepts;

public class Sample {

	public static void main(String[] args) {
		System.out.println("main start");

		Thread t = new Thread("thread class");
		t.start();
		System.out.println(t.getName());

		Thread t1 = new SumThread("sum thread1 class");
		t1.start();
		System.out.println(t1.getName());

		Thread t2 = new SumThread("sum thread class");
		t2.start();
		System.out.println(t2.getName());

		System.out.println("Main end");

	}

}
