package april.Section3.RealScenarioProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Combine_TwoString_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the student class 1: ");
		int size1 = sc.nextInt();
		sc.nextLine();
		String[] str1 = new String[size1];

		for (int i = 0; i < str1.length; i++) {
			System.out.println("Enter the student name " + (i + 1) + " for class 1: ");
			str1[i] = sc.nextLine();
		}

		System.out.println("Enter the size of the Student class 2: ");
		int size2 = sc.nextInt();
		sc.nextLine();
		String[] str2 = new String[size2];

		for (int i = 0; i < str2.length; i++) {
			System.out.println("Enter the student name " + (i + 1) + " for class 2: ");
			str2[i] = sc.nextLine();
		}

		String[] str3 = new String[size1 + size2];
		for (int i = 0; i < str3.length; i++) {
			if (i < size1)
				str3[i] = str1[i];
			else
				str3[i] = str2[i - size1];
		}
		System.out.println("Combine array: ");
		System.out.println(Arrays.toString(str3));
	}
}
