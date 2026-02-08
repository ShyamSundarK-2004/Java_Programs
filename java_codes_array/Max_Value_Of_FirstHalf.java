package java_codes_array;

public class Max_Value_Of_FirstHalf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length / 2; i++) {
			max = a[i] > max ? a[i] : max;
		}
	}
}
