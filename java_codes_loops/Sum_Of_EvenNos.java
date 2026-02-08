package java_codes_loops;

public class Sum_Of_EvenNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int res = 0;
		int end = 20;
		do {
			if (n % 2 == 0) {
				res += n;
			}
			n++;
		} while (n < end);
		System.out.println(res);

	}

}
