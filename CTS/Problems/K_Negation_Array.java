package april.CTS.Problems;

import java.util.Arrays;

public class K_Negation_Array {

	public static void main(String[] args) {
		int[] a = { 4, 2, 3 };
		int k = 1;
		while (k != 0) {
			Arrays.sort(a);
			a[0] *= -1;
			k--;
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		System.out.println(sum);

	}
}