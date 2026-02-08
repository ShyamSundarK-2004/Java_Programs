package april.Threading_Concepts;

public class ProductThread extends Thread {
	public void run(){
		int prod = 1;
		for (int i = 1; i <= 5; i++) {
			prod *= i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println(prod);
	}
}
