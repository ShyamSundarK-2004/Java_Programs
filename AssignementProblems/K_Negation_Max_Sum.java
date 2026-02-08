package april.AssignementProblems;

import java.util.PriorityQueue;
import java.util.Scanner;

public class K_Negation_Max_Sum {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		queue.add(40);
		queue.add(20);
		queue.add(5);
		queue.add(10);
		queue.add(25);

		System.out.println("Enter the K Value: ");
		int k = new Scanner(System.in).nextInt();

		for (int i = 1; i <= k; i++) {
			queue.add(queue.poll() * -1);
		}
		System.out.println(queue.element());
		int sum = 0;
		for (Integer n : queue)
			sum += n;

		System.out.println(sum);

	}

}
