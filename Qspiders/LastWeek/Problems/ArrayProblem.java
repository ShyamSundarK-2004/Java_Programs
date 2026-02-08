package Qspiders.LastWeek.Problems;

public class ArrayProblem {

	public static void main(String[] args) {
		int[] a = { 2, 10, 5, 4, 7, 9 };

		for (int i = 0; i < a.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[i]) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.print(a[i] + " ");
		}
	}

}
