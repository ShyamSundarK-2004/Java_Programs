package java_codes_array;

public class FirstHalf_Array_in_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("before first half reverse");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ",");

		System.out.println();
		reverse(a);
		System.out.println("after first half reverse");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ",");
	}

	private static int[] reverse(int[] a) {
		for (int i = 0, j = a.length % 2 == 0 ? a.length / 2 : a.length / 2 + 1; i < j; i++) {
			int temp = a[i];
			a[i] = a[--j];
			a[j] = temp;
		}
		return a;

	}
}
