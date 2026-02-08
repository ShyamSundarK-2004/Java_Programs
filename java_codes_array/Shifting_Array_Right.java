package java_codes_array;

import java.util.Scanner;

public class Shifting_Array_Right {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of shift ");
		int shift = sc.nextInt();

		int[] a = { 1, 2, 3, 4, 5 };
//		System.out.println("shifting the array once");
//		shift_once(a);
//		System.out.println();
//		System.out.println("shifting the array twice");
//		shift_twice(a);
		System.out.println("Shifting according to the user input- " + shift);
		user_shift(a, shift);

	}

	public static void shift_once(int[] a) {
		int temp = a[a.length - 1];
		for (int i = a.length - 1; i > 0; i--)
			a[i] = a[i - 1];
		a[0] = temp;
		for (int arr : a)
			System.out.print(arr + " ,");
	}

	public static void shift_twice(int[] a) {
		for (int j = 0; j < 2; j++) {
			int temp = a[a.length - 1];
			for (int i = a.length - 1; i > 0; i--) {
				a[i] = a[i - 1];
			}
			a[0] = temp;
		}
		for (int arr : a)
			System.out.print(arr + " ,");
	}

	public static void user_shift(int[] a, int shift) {
		for (int j = 0; j < shift; j++) {
			int temp = a[a.length - 1];
			for (int i = a.length - 1; i > 0; i--) {
				a[i] = a[i - 1];
			}
			a[0] = temp;
		}
		for (int arr : a)
			System.out.print(arr + " ,");
	}
}
