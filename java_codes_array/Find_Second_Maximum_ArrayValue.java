package java_codes_array;

public class Find_Second_Maximum_ArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4 };
		Find_max(a);
	}

	public static void Find_max(int[] a) {
		int first_max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= first_max) {
				second_max = first_max;
				first_max = a[i];
			} else if (a[i] > second_max && a[i] < first_max) {
				second_max = a[i];
			}

		}
		System.out.println("first min: " + first_max);
		System.out.println("Second min: " + second_max);
	}
}
