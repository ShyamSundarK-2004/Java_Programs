package april.Section3.RealScenarioProblems;

public class Check_Duplicate_Array_Int {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 10 };
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = 0;
					count++;
					break;
				}
			}
		}
		System.out.println(arr.length-count);
		for (int a : arr)
			System.out.print(a + " ");

	}

}
