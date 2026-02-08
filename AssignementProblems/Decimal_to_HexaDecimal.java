package april.AssignementProblems;

public class Decimal_to_HexaDecimal {

	public static void main(String[] args) {
		int n = 27;
		String hexa = "";
		while (n != 0) {
			int rem = n % 16;
			char c = 87;

			if (rem > 9) {
				c = (char) (c + rem);
				hexa = c + hexa;
			} else {
				hexa = rem + hexa;
			}

			n /= 16;
		}

		System.out.println(hexa);
	}

}
