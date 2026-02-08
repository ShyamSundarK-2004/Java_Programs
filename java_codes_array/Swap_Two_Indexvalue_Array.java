package java_codes_array;

import java.util.Iterator;
import java.util.Scanner;

public class Swap_Two_Indexvalue_Array {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int len = a.length - 1;
		System.out.println("the total index position are from 0 to " + len);

		Swap_index(a);

	}

	public static void Swap_index(int[] a) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the index to of value:");
		int val_index = sc.nextInt();
		System.out.println("enter the index to swap the value: ");
		int swap_index = sc.nextInt();

		System.out.println("before swapping....");
		for (int arr : a)
			System.out.print(arr + ", ");
		System.out.println();
		System.out.println("value at index: " + val_index + " is " + a[val_index]);
		System.out.println("value at index: " + swap_index + " is " + a[swap_index]);
		int temp = 0;

		if (val_index == swap_index) {
			System.out.println("both index are same so no need to swap");
			return;
		} else {
			temp = a[val_index];
			a[val_index] = a[swap_index];
			a[swap_index] = temp;
		}
		System.out.println("after swapping....");
		for (int arr : a)
			System.out.print(arr + ", ");
		System.out.println();
		System.out.println("value at index: " + val_index + " is " + a[val_index]);
		System.out.println("value at index: " + swap_index + " is " + a[swap_index]);

	}
}