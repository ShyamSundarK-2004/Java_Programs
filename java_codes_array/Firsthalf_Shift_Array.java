package java_codes_array;

import java.util.Scanner;

public class Firsthalf_Shift_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 4, 5 };
		System.out.println("enter the no of shift ");
		int shift = sc.nextInt();
		int[] c = get_firsthalf(a);
		int[] d = get_Secondhalf(b);
		for (int arr : c) {
			System.out.print(arr + " ,");
		}
		System.out.println();
		for (int arr : d) {
			System.out.print(arr + " ,");
		}

	}

	public static int[] get_firsthalf(int[] a) {
		int[] firsthalf = new int[a.length / 2];
		for (int i = 0; i < a.length / 2; i++) {
			firsthalf[i] = a[i];
		}
		return firsthalf;
	}

	public static int[] get_Secondhalf(int[] a) {
		int[] secondhalf = new int[a.length];
		for (int i = 0; i > a.length - 1; i++) {
			secondhalf[i] = a[a.length + i];
		}
		return secondhalf;
	}

}
