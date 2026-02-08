package java_codes_array;

public class Sum_Of_SecondHalf_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if the length is odd then add +1 to the a.length+1 so it add the mid value to
					// it
					// you should add the mid value either in first or second half when the length
					// is odd
		int[] a = { 10, 20, 30, 40, 50 };
		int res = 0;
		for (int i = a.length / 2; i < a.length; i++) {
			res += a[i];
		}
		System.out.println("the sum of Second half array values is: " + res);
	}
}
