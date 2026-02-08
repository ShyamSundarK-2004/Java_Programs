package java_codes_array;

public class Array_odd_even_Index_sum {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40 };

		System.out.println("even index sum: " + even_sum(a));
		System.out.println("odd index sum: " + odd_sum(a));

	}

	public static int even_sum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length / 2; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static int odd_sum(int[] a) {
		int sum = 0;
		for (int i = a.length / 2; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

}
