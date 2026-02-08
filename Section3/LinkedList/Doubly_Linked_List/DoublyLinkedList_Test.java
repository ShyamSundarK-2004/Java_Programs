package april.Section3.LinkedList.Doubly_Linked_List;

import java.util.Iterator;

public class DoublyLinkedList_Test {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		System.out.println(list.isEmpty());

		list.append(10);
		list.append(20);
		list.append(30);
		list.append(40);
		list.append(50);

//		list.prepend(9);
//		list.prepend(8);

//		list.insert(2, 25);
//
//		list.insert(1, 22);

		System.out.println(list.size + " " + list.head.data + "  " + list.tail.data);

//		list.removeFirst();
//
//		System.out.println(list.head.prev);
//
//		list.removeLast();
//
//		System.out.println(list.tail.next +" "+list.tail.data+ " " + list.tail.prev.data);
//	

		list.removeIndex(1);
		list.display();

	}

}
