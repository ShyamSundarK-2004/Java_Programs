package april;

class PowerMethod {
	public static void main(String[] args) {
		int num = 1234;
		int count = 0;
		int temp = num;
		while (temp != 0) {
			temp /= 10;
			count++;
		}

		int powerdigit = power(10, count - 1);
		System.out.println(num / powerdigit);

	}

	public static int power(int base, int expo) {

		int digit = 1;
		for (int i = 0; i < expo; i++) {
			digit *= base;
		}
		return digit;

	}
}
