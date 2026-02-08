package java_codes_array;

public class Check_Array_order {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 60, 50, 40 };

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1])
				System.out.println("Not in order at index: " + i + ", value: " + a[i]);

		}
	}
}
