package java_codes_array;

public class Maximum_OddIndex_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 25, 35, 68, 72, 150, 13 };
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0)
				max = a[i] > max ? a[i] : max;
		}
		System.out.println("the max value at odd index is: " + max);

	}
}
