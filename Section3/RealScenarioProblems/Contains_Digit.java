package april.Section3.RealScenarioProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Contains_Digit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of usernames: ");
		int size = sc.nextInt();

		String[] arr = new String[size];
		String[] num = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		System.out.println("Enter the username in the array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.next();
		}

		System.out.println("Usernames that contain digits:");
		for (int i = 0; i < size; i++) {
			boolean hasDigit = false;

			// Check each digit in the num array
			for (int j = 0; j < num.length; j++) {
				if (arr[i].contains(num[j])) {
					hasDigit = true;
					break;
				}
			}

			if (hasDigit) {
				System.out.println(arr[i]);
			}
		}
	}
}
