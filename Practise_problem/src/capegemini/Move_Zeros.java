package capegemini;

public class Move_Zeros {
	public static void main(String[] args) {
		int[] arr = { 0, 9, 4, 5, 0, 6 };

		int result[] = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				result[index++] = arr[i];
			}
		}
		for (int i = index; i < result.length; i++) {
			result[i] = 0;
		}

		for (int a : result) {
			System.out.print(a + " ");
		}
	}

}
