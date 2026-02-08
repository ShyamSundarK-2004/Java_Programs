package java_codes_loops;

public class Reverse_second_to_first_half {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 571211;
		int sechalf = num % 1000;
		int firsthalf = num / 1000;
		int res = 0;
		res = sechalf * 1000;
		res += firsthalf;

		System.out.println(res);

	}

}
