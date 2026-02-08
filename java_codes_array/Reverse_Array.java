package java_codes_array;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the " + i + " element:");
			a[i] = sc.nextInt();
		}

//		 printing the array
//		for (int i = 0; i < a.length; i++) {
//			System.out.println("the " + i + " element is: " + a[i]);
//
//		}

		// printing the array in reverse
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + ",");

		}

	}

}
