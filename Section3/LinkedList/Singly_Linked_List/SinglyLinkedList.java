package april.Section3.LinkedList.Singly_Linked_List;

public class SinglyLinkedList {

	Node head;
	Node tail;
	int size;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	// append data at the last
	public boolean append(int data) {
		if (isEmpty()) {
			Node n = new Node(data);
			head = n;
			tail = n;
		} else {
			Node n = new Node(data);
			tail.next = n;
			tail = n;
		}
		size++;
		return true;
	}

	// display the list elements
	public void display() {
		if (isEmpty()) {
			return;
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + "--->");
				temp = temp.next;
			}

		}
	}

	// add data in the beginning
	public boolean prepend(int data) {
		if (isEmpty()) {
			Node n = new Node(data);
			head = tail = n;
		} else {
			Node n = new Node(data);
			n.next = head;
			head = n;
		}
		size++;
		return true;
	}

	// add data at the middle of the list

	public boolean insert(int index, int data) {
		if (isEmpty()) {
			Node n = new Node(data);
			head = tail = n;
		} else if (index == 0) {
			return prepend(data);
		} else if (index >= size) {
			return append(data);
		} else if (index <= size) {
			Node n = new Node(data);
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			n.next = temp.next;
			temp.next = n;
		}
		size++;
		return true;
	}

	public boolean removeFirst() {
		if (isEmpty()) {
			System.out.println("No Elements Found.");
			return false;
		} else if (head == tail) {
			head = tail = null;
			size--;
		} else {
			head = head.next;
			size--;
		}

		return true;
	}

	public boolean removeLast() {
		if (isEmpty()) {
			return false;
		} else if (head == tail) {
			head = tail = null;
		} else {
			Node temp = head;
			while (temp.next != tail) {
				temp = temp.next;
			}
			tail = temp;
			temp.next = null;
		}
		size--;
		return true;
	}

	public boolean removeElement(int index) {
		if (isEmpty()) {
			return false;
		} else if (index >= size - 1) {
			removeLast();
		} else if (head == tail) {
			head = tail = null;
		} else if (index == 0) {
			removeFirst();
		} else {
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;

		}
		size--;
		return true;
	}

	public int get(int index) {
		if (isEmpty()) {
			return -1;
		} else if (head == tail) {
			return head.data;
		} else if (index >= size - 1) {
			return tail.data;
		} else {
			Node temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp.data;
		}

	}

	public int search(int data) {
		if (isEmpty()) {
			return -1;
		} else {
			Node temp = head;
			int i = 0;
			while (temp != null) {
				if (temp.data == data) {
					return i;
				}
				temp = temp.next;
				i++;
			}

		}
		return -1;

	}

	public boolean add(SinglyLinkedList s) {
		if (isEmpty()) {
			this.head = s.head;
			this.tail = s.tail;
		} else {
			this.tail.next = s.head;
			this.tail = s.tail;
		}
		size++;
		return true;
	}

	public void findMiddle() {
		if (isEmpty()) {
			return;
		} else {
			Node temp1 = head;
			Node temp2 = head;
			while (temp1.next != null && temp1.next.next !=null) {
				temp1 = temp1.next.next;
				temp2 = temp2.next;
			}
			System.out.println(temp2.data);
		}
	}
}
