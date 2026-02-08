package april.Section3.LinkedList.Circular_Linked_List;

public class CircularLinkedList_Test {
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		// checking is list is empty or not
		System.out.println(list.isEmpty());

		list.append(10);
		list.append(20);
		list.append(25);
//
//		list.prepend(5);
//
//		list.add(2, 15);

		System.out.println("Size :" + list.size);

		// list.removeFirst();

//		list.removeLast();

//		list.removeIndex(0);

//		System.out.println(list.head.data + " " + list.tail.data);
//
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));

		System.out.println(list.search(10));
		System.out.println(list.search(20));
		System.out.println(list.search(25));

		list.display();

	}
}
