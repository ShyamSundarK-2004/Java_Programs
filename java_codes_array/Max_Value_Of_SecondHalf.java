package java_codes_array;

public class Max_Value_Of_SecondHalf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int max = Integer.MIN_VALUE;
		for (int i = a.length / 2; i < a.length; i++) {
			max = a[i] > max ? a[i] : max;
		}
		System.out.println("the min value in the first half is : " + max);
	}
}
