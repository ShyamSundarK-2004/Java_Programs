package april.AssignementProblems;

import java.util.Scanner;

public class Magical_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row value: ");
		int row = sc.nextInt();
		System.out.println("Enter column value: ");
		int col = sc.nextInt();

		int[][] a = new int[row][col];
		System.out.println("Enter Array value: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println(magicalArray(row, col, a));

	}

	public static int magicalArray(int row, int col, int[][] a) {
		int magicalRows = 0;

		for (int i = 0; i < row; i++) {
			int oddSum = 0;
			for (int j = 0; j < col; j++) {
				if (a[i][j] % 2 != 0)
					oddSum += a[i][j];
			}
			if (oddSum % 2 == 0) {
				magicalRows++;
			}
		}

		return magicalRows;

	}

}
