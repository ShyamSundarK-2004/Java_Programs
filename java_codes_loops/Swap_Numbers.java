package java_codes_loops;

import java.util.Scanner;

public class Swap_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value for A:");
		int a = sc.nextInt();
		System.out.println("Enter the value for B:");
		int b = sc.nextInt();

		System.out.println("before swapping  A: "+a+" B: "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swapping  A: "+a+" B: "+b);

	}

}
