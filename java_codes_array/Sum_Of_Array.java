package java_codes_array;

public class Sum_Of_Array {

//	public static int sumArray(int[] arr) {
//		int res = 0;
//		for (int i = 0; i < arr.length; i++) {
//			res += arr[i];
//		}
//		return res;
//	}
	public static int sumArray(int[] arr) {
		int res = 0;
		for (int i : arr) {
			res += i;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 10, 20, 30, 40, 50 };

		System.out.println(sumArray(a));

	}

}
