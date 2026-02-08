package capegemini;

public class FindSecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 10, 10, 5, 5 };

		int firstmax = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (firstmax < arr[i]) {
				secondmax = firstmax;
				firstmax = arr[i];
			} else if (arr[i] > secondmax && arr[i] < firstmax) {
				secondmax = arr[i];
			}
		}
		System.out.println("Final First max : " + firstmax);
		System.out.println("Final Second max : " + secondmax);

	}

}
