package java_codes_array;

import java.util.Scanner;

public class Swapping_Index_Array {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int len = a.length - 1;
		System.out.println("The total index positions are from 0 to " + len);

		swapIndex(a);
	}

	public static void swapIndex(int[] a) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first index to swap:");
		int valIndex = sc.nextInt();

		System.out.println("Enter the second index to swap:");
		int swapIndex = sc.nextInt();

		// Validate indices
		if (valIndex < 0 || valIndex >= a.length || swapIndex < 0 || swapIndex >= a.length) {
			System.out.println("Invalid index. Please enter indices between 0 and " + (a.length - 1));
			sc.close();
			return;
		}

		System.out.println("Before swapping...");
		System.out.println("Value at index " + valIndex + " is " + a[valIndex]);
		System.out.println("Value at index " + swapIndex + " is " + a[swapIndex]);

		// Swap only if indices are different
		if (valIndex == swapIndex) {
			System.out.println("Both indices are the same. No swapping needed.");
		} else {
			// Swapping logic
			int temp = a[valIndex];
			a[valIndex] = a[swapIndex];
			a[swapIndex] = temp;
		}

		System.out.println("After swapping...");
		System.out.println("Value at index " + valIndex + " is " + a[valIndex]);
		System.out.println("Value at index " + swapIndex + " is " + a[swapIndex]);

		sc.close(); // Close Scanner to prevent resource leaks
	}
}
