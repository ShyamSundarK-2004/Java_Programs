package java_codes_array;

import java.util.Scanner;

public class Left_Right_Shift_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 4, 5 };
		System.out.println("enter the no of shift ");
		int shift = sc.nextInt();
		System.out.println("shifting the array with user input rigth - " + shift);
		shift_userinput_right(a, shift);
		System.out.println();
		System.out.println("shifting the array with user input left - " + shift);
		shift_userinput_left(b, shift);

	}

	public static void shift_userinput_right(int[] a, int shift) {
		for (int i = 0; i < shift; i++) {
			int temp = a[a.length - 1];
			for (int j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = temp;
		}
		for (int arr : a)
			System.out.print(arr + " ,");
	}

	public static void shift_userinput_left(int[] a, int shift) {
		for (int i = 0; i < shift; i++) {
			int temp = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = temp;
		}
		for (int arr : a)
			System.out.print(arr + " ,");

	}

}
