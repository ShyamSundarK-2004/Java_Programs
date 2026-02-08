package java_codes_array;

import java.util.Scanner;

public class Find_ArrayElement_IndexValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Enter the element that is in the array:");
		int userdata = sc.nextInt();

		int index = check_value(a, userdata);
		if (index != -1)
			System.out.println("The index of the element is: " + index);
		else
			System.out.println("Element not found in the array.");

	}

	public static int check_value(int[] array, int data) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == data) {
				return i; // Return index if the element is found
			}
		}
		return -1; // Return -1 if the element is not found
	}
}
