package april.AssignementProblems;

import java.util.Arrays;

public class Find_Kth_Largest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 20, 31, 42, 10, 15, 171 };
		Find_max(a);
	}

	public static void Find_max(int[] a) {
		Arrays.sort(a);
		int first_max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		int third_max = Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= first_max) {
				third_max = second_max; // Shift down previous values
				second_max = first_max;
				first_max = a[i];
			} else if (a[i] > second_max && a[i] < first_max) {
				third_max = second_max;
				second_max = a[i];
			} else if (a[i] > third_max && a[i] < second_max) {
				third_max = a[i];
			}

		}
		System.out.println("first max: " + first_max);
		System.out.println("Second max: " + second_max);
		System.out.println("Third max: " + third_max);
	}

}
