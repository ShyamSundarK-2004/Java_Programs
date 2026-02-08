package java_codes_array;

import java.util.Scanner;

public class Creating_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] a = new int[3];

		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the value of array at index at " + i + " :");
			a[i] = sc.nextInt();
			sc.nextLine();
		}

		for (int arr : a) {
		
			System.out.println(arr);
		}

//		int a[] = { 10 };
//		int b[] = { 20 };
//
//		test(a);
//		test(b);
//	}
//
//	public static void test(int[] z) {
//		System.out.println(z[0]);
//		return;
//	}
	}
}
