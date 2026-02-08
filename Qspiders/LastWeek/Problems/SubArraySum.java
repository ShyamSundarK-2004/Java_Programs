package Qspiders.LastWeek.Problems;

public class SubArraySum {

	public static void main(String[] args) {
		int target = 26;
		int[] arr = { 2, 5, 8, 13, 12 };
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			int subSum = 0;
			for (int j = i; j < arr.length; j++) {
				subSum += arr[j];
				if (subSum == target) {
					flag = true;
					break;
				}
			}
		}
		System.out.println(flag);

	}

}
