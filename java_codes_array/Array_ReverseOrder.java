package java_codes_array;

public class Array_ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("before array reverse");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ",");

		System.out.println("----------------------------");
		reverse(a);
		System.out.println("after array reverse");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ",");

	}

	public static int[] reverse(int[] a) {
		for (int i = 0, j = a.length; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[--j];
			a[j] = temp;
		}
		return a;

	}
}
