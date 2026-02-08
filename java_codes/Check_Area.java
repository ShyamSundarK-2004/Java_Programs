package java_codes;

import java.util.Scanner;

public class Check_Area {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length:");
		int length = sc.nextInt();
		System.out.println("Enter the Breadth:");
		int breadth = sc.nextInt();

		int area = length * breadth;

		int perimeter = 2 * (length + breadth);

		if (area > perimeter) {
			System.out.println("The area: " + area + " is greater than perimeter: " + perimeter + " of the rectangle.");
		} else if (area == perimeter) {
			System.out.println("The area: " + area + " is equal to the  perimeter: " + perimeter + " of the rectangle.");
		} else {

			System.out.println("The area: " + area + " is lesser than perimeter: " + perimeter + " of the rectangle.");
		}

	}

}
