package java_codes_loops;

import java.util.Scanner;

public class Print_Numbers {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the vaalue for n:");
		int input = sc.nextInt(); 
		int maxNumber = input * input;

		for (int i = 1; i <= maxNumber; i++) {
			
			System.out.printf("%02d ", i);
			// to add a digit in the output and give the output with 2 digits

			
			if (i % input == 0) {
				System.out.println();
			}
		}
	}
}