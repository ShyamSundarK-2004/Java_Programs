package java_codes_array;

public class Average_Of_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 20, 30, 40, 50 };

		int sum = sumArray(a);
		int avg = sum / a.length;
		System.out.println("the average of the array elements is: " + avg);
	}

	public static int sumArray(int[] arr) {
		int res = 0;
		for (int i : arr) {
			res += i;
		}
		return res;
	}
}
