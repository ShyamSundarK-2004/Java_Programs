package april.AssignementProblems;

import java.util.Scanner;

public class Decimal_to_Binary {
	public static void main(String[] args) {

		System.out.println("Enter a decimal Number: ");
		int num = new Scanner(System.in).nextInt();

		String bin = "";

		while (num != 0) {
			int rem = num % 2;
			bin = rem + bin;
			num /= 2;
		}

		System.out.println(1%2);

	}
}
