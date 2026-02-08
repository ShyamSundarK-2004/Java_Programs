package april.Section3.LinkedList.Singly_Linked_List;

public class SinglyLinkedList_Test {

	public static void main(String[] args) {
		SinglyLinkedList list1 = new SinglyLinkedList();
		System.out.println(list1.isEmpty());
		list1.append(10);
		list1.append(20);
		list1.append(30);
		list1.append(40);
		//list1.append(50);

//		SinglyLinkedList list2 = new SinglyLinkedList();
//		System.out.println(list2.isEmpty());
//		list2.append(40);
//		list2.append(50);
//
//		list1.add(list2);
//		System.out.println(list1.head.data + " " + list1.tail.data);
//		System.out.println(list1.size);
//		list1.display();
		list1.findMiddle();

	}

}
