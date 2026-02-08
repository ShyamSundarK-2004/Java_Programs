package april.Section3.RealScenarioProblems;

public class Check_Duplicate_Array_String {

	public static void main(String[] args) {

		String[] arr = { "Charlie", "john", "bob", "Charlie" };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					arr[i] = null;
					break;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}
		}

	}
}
