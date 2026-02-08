package java_codes_loops;

public class Print_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		char a = 'A';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print(a + " ");
					a++;
				} else {
					System.out.print((j + i + 2) + " ");

				}

			}
			System.out.println();
		}

	}

}
