package Qspiders.LastWeek.Problems;

public class MissingNumber {
	public static void main(String[] args) {

		int[] a = { 1, 6, 4, 5, 3, 7 };
		int arrSum = 0;

		int n = a.length + 1;
		int sum = (n * (n + 1)) / 2;

		for (int i = 0; i < a.length; i++)
			arrSum += a[i];

		System.out.println("Missing number: " + (sum - arrSum));
	}
}
