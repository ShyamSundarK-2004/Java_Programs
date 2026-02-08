package april.Threading_Concepts;

public class SampleThread {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum += i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println(sum);

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
