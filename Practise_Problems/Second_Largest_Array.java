package Practise_Problems;

public class Second_Largest_Array {

	public static void main(String[] args) {

		int[] arr = { 3, 8, 1, 6, 5 };
		System.out.println(findSecondMax(arr));

	}

	public static int findSecondMax(int[] a) {

		int Fmax = Integer.MIN_VALUE;
		int Smax = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > Fmax) {
				Smax = Fmax;
				Fmax = a[i];
			} else if (a[i] > Smax && a[i] < Fmax) {
				Smax = a[i];
			}
		}

		return Smax;

	}

}
