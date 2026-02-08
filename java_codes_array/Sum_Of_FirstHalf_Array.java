package java_codes_array;

public class Sum_Of_FirstHalf_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 10, 20, 30, 40, 50, 60, 70 };

		int res1 = 0;
		for (int i = 0; i < a.length / 2; i++)
			res1 += a[i];
		System.out.println("the sum of first half array values is: " + res1);

		int res2 = 0;
		for (int i = a.length / 2; i < a.length; i++)
			res2 += a[i];
		System.out.println("the sum of Second half array values is: " + res2);

	}
}
