package java_codes_array;

import java.util.Scanner;

public class Store_Array_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int n = sc.nextInt();

		int[] a = SquareArray(n);
		System.out.println("After squaring the array value: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + ",");
		}

	}

	public static int[] SquareArray(int size) {
		int[] a = new int[size];

		// this takes an extra memory so to avoid
//		for (int index = 0, x = 1; index < a.length; index++, x++) {
//			a[index] = x * x;
//		}
		// we can use the index value itself
		for (int index = 0; index < a.length; index++) {
			a[index] = (index + 1) * (index + 1);
		}
		return a;

	}

}
