package april.AssignementProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Kth_Largest_Elements {
	public static void main(String[] args) {

		int[] arr = { 20, 31, 52, 10, 25 };
		Arrays.sort(arr);
		System.out.println("Enter K value");
		int k = new Scanner(System.in).nextInt();
		System.out.println("Kth- largest value: " + arr[arr.length - k]);
	}

}
