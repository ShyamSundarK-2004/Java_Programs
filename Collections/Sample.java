package april.Collections;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
//		System.out.println(list);
//		list.remove(1);
//		System.out.println(list);
//		list.remove((Integer) 10);
//		System.out.println(list);

		ArrayList<Integer> list1 = new ArrayList();

		list1.add(10);
		list1.add(25);
		list1.add(35);
		list1.add(40);
		list1.add(50);

		// list.addAll(list1);
		// list.removeAll(list1);
		list.retainAll(list1);
		System.out.println(list);
//
//		ArrayList<String> list2 = new ArrayList();
//
//		list2.add("Shyam");
//		list2.add("Sundar");
//		list2.add("k");
//
//		System.out.println(list2);
//
//		list2.remove(0);
//
//		System.out.println(list2);
//		list2.remove("k");
//		System.out.println(list2);

	}

}
