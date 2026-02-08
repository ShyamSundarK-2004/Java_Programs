package april.Section3.LinkedList.Doubly_Linked_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);

//		int sum = 0;
//		for (int i = 0; i < list.size(); i++) {
//			sum = sum + list.get(i);
//		}
//		System.out.println(sum);
//
//		Iterator i = list.iterator();
//		int sum1 = 0;
//		while (i.hasNext()) {
//			sum1 = sum1 + (int) i.next();
//		}
//		System.out.println(sum1);

		ListIterator i = list.listIterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println();

		while (i.hasPrevious()) {
			System.out.println(i.previous());
		}

	}

}
