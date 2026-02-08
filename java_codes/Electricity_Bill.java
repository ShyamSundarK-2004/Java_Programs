package java_codes;

import java.util.Scanner;

public class Electricity_Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the units to calculate electricity bill:");

		int units = sc.nextInt();
		double amt;

		if (units > 0 && units <= 50) {
			amt = units * 0.50;
			System.out.println("you consumed: " + units + " and the amount is: " + amt);
		} else if (units > 50 && units <= 150) {
			System.out.println("you consumed: " + units);
			units -= 50;
			amt = 50 * 0.50 + units * 0.75;
			System.out.println("the amount is: " + amt);
		} else if (units > 150 && units <= 250) {
			System.out.println("you consumed: " + units);
			units -= 150;
			amt = 50 * 0.50 + 100 * 0.75 + units * 1.20;
			System.out.println("the amount is: " + amt);
		} else {
			System.out.println("you consumed: " + units);
			units -= 250;
			amt = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + units * 1.50;
			amt*=0.2;
			System.out.println("the amount is: " + amt);

		}

	}

}
