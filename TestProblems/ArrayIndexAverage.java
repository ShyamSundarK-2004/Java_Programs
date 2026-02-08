package april.TestProblems;

import java.util.Scanner;

public class ArrayIndexAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int sum = 0;
		int count = 0;
		int[] arr = new int[size];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i += 2) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
				sum += arr[i];
				count++;
			} else {
				System.out.println("-1");
			}
		}

		System.out.println("Average of the even elements at even index: " + sum / count);

	}
}
