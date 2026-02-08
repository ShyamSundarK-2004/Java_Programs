package april.Section3.RealScenarioProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Combine_TwoStringArray_UniqueArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the supplier 1: ");
		int size1 = sc.nextInt();
		sc.nextLine();
		String[] str1 = new String[size1];

		for (int i = 0; i < str1.length; i++) {
			System.out.println("Enter the product name " + (i + 1) + " for supplier 1: ");
			str1[i] = sc.nextLine();
		}

		System.out.println("Enter the size of the supplier 2: ");
		int size2 = sc.nextInt();
		sc.nextLine();
		String[] str2 = new String[size2];

		for (int i = 0; i < str2.length; i++) {
			System.out.println("Enter the product name " + (i + 1) + " for supplier 2: ");
			str2[i] = sc.nextLine();
		}
		// coping the two arrays into one array
		String[] str3 = new String[size1 + size2];
		for (int i = 0; i < str3.length; i++) {
			if (i < size1)
				str3[i] = str1[i];
			else
				str3[i] = str2[i - size1];
		}
		System.out.println("Combine array: ");
		System.out.println(Arrays.toString(str3));
		// checking the duplicate array elements
		for (int i = 0; i < str3.length; i++) {
			for (int j = i + 1; j < str3.length; j++) {
				if (str3[i] != null)
					if (str3[i].equals(str3[j])) {
						str3[i] = null;
					}
			}
		}

		System.out.println("Unique Combine array: ");
		System.out.println(Arrays.toString(str3));

	}
}
