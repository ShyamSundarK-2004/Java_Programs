package java_codes_array;

public class SecondHalf_Array_in_Reverse {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("before second half reverse");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ",");

		System.out.println();
		reverse(a);
		System.out.println("after second half reverse");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ",");
	}

	private static int[] reverse(int[] a) {
		for (int i = a.length / 2, j = a.length; i < j; i++) {
			int temp = a[i];
			a[i] = a[--j];
			a[j] = temp;
		}
		return a;

	}
}