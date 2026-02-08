package java_codes_array;

public class Average_Of_FirstHalf_Array {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int count = 0;
		int res = 0;
		for (int i = 0; i < a.length / 2; i++) {
			res += a[i];
			count++;
		}
		int avg = res / count;

		System.out.println("the average of the even index position is: " + avg);

	}

}
