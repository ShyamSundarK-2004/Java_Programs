package april.CTS.Problems;

public class Array_permutation {

	public static void main(String[] args) {

		int[] a = { 2, 1, 3, 4, 4 };

		for (int i = 0; i < a.length - 1; i++) {
			int swap;
			for (int j = 0; j < a.length - i - 1; i++) {
				if (a[j] > a[j + 1]) {
					swap = a[j];
					a[j] = a[j + 1];
					a[j + 1] = swap;
				}
			}

		}
		for (int arr : a)
			System.out.print(arr + " ");

		System.out.println();
		boolean flag = true;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != i + 1) {
				flag = false;
				break;
			}
		}
		if (a[a.length - 1] == a.length - 1 && flag == true) {
			System.out.println("good array");
		} else {
			System.out.println("not a good array");
		}

	}
}
