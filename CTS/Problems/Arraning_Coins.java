package april.CTS.Problems;

public class Arraning_Coins {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					System.out.println("| $ |");
				}
			}
		}
	}

}
