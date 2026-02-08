package java_codes_array;

public class Find_Second_Mininum_ArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4 };
		Find_min(a);
	}

	public static void Find_min(int[] a) {
		int first_min = Integer.MAX_VALUE;
		int second_min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= first_min) {
				second_min = first_min;
				first_min = a[i];
			} else if (a[i] < second_min && a[i] > first_min) {
				second_min = a[i];
			}

		}
		System.out.println("first min: " + first_min);
		System.out.println("Second min: " + second_min);
	}
}
