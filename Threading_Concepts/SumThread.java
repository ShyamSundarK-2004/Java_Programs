package april.Threading_Concepts;

public class SumThread extends Thread {

	SumThread() {

	}

	SumThread(String s) {
		super(s);
	}

	public void run() {
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum += i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println(sum);
	}

}
