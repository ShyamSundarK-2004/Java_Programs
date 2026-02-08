package java_codes_array;

import java.util.Scanner;

public class Shift_Array_Left {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println("enter the no of shift ");
		int shift = sc.nextInt();
		System.out.println("shifting the array with user input- " + shift);
		shift_userinput(a, shift);

	}

	public static void shift_userinput(int[] a, int shift) {
		for (int j = 0; j < shift; j++) {
			int temp = a[0];
			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[a.length - 1] = temp;
		}
		for (int arr : a)
			System.out.print(arr + " , ");
	}

}
