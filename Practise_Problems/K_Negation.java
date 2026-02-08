package Practise_Problems;

import java.util.PriorityQueue;

public class K_Negation {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(4);
		pq.add(2);
		pq.add(3);

		int k = 1;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			pq.add(pq.remove() * -1);
		}

		for (Integer num : pq)
			sum += num;

		System.out.println(sum);
	}
}
