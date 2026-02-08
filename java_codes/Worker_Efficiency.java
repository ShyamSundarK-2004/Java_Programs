package java_codes;

import java.util.Scanner;

public class Worker_Efficiency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the time taken by the worker to complete the job (in hours): ");
		float time = sc.nextFloat();

		if (time >= 2 && time <= 3) {
			System.out.println("Worker is Highly Efficient");
		} else if (time > 3 && time <= 4) {
			System.out.println("Worker needs to Improve Speed");
		} else if (time > 4 && time <= 5) {
			System.out.println("Worker requires Training");
		} else if (time > 5) {
			System.out.println("Worker has to Leave the Company");
		}
	}
}
