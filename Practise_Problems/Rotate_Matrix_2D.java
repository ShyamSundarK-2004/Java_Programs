package Practise_Problems;

public class Rotate_Matrix_2D {

	public static void main(String[] args) {
		int[][] mat = { { 0, 1 }, { 1, 0 } };
		int[][] tar = { { 1, 0 }, { 0, 1 } };

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] == 0) {
					mat[i][j] = 1;
				} else {
					mat[i][j] = 0;
				}
			}
		}
		boolean flag = false;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] == tar[i][j])
					flag = true;
			}
		}

		System.out.println(flag);
	}

}
