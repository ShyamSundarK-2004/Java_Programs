package april.ExceptionHandling;

import java.util.Scanner;

public class Nested_Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("NUM 1");
		int num1 = sc.nextInt();
		System.out.println("NUM 2");
		int num2 = sc.nextInt();

		try {
			System.out.println(num1 / num2);
			try {
				int[] a = new int[5];
				System.out.println(a[6]);
			} catch (Exception e) {
				System.out.println("AIOOB E Handled");
			}
		} catch (Exception e) {
			System.out.println("AE Handled");
		}
	}

}
