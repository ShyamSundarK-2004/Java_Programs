package april.AssignementProblems;

import java.util.*;

public class MatrixPathFinder {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 0 }, { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 0 },
				{ 1, 2, 3, 4, 5 } };

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter starting row (1-based): ");
		int startRow = sc.nextInt() - 1;

		System.out.print("Enter starting column (1-based): ");
		int startCol = sc.nextInt() - 1;

		sc.nextLine(); // consume newline
		System.out.print("Enter path (e.g., >>v): ");
		String path = sc.nextLine();

		int rows = matrix.length;
		int cols = matrix[0].length;
	}
}