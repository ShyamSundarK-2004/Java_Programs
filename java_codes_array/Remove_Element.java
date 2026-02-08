package java_codes_array;

import java.util.Scanner;

public class Remove_Element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int[] a = new int[size];

		System.out.println("Enter the array elements:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the index to remove:");
		int index = sc.nextInt();

		if (index >= size || index < 0) {
			System.out.println("Invalid index");
		} else {
			// Create a new array with size - 1
			int[] newArray = new int[size - 1];

			// Copy elements up to the index to be removed
			for (int i = 0; i < index; i++) {
				newArray[i] = a[i];
			}

			// Copy elements after the index to be removed
			for (int i = index; i < size - 1; i++) {
				newArray[i] = a[i + 1];
			}

			// Print the new array
			System.out.println("After removing the element:");
			for (int i = 0; i < newArray.length; i++) {
				System.out.print(newArray[i] + " ");
			}
		}

		sc.close();
	}
}
