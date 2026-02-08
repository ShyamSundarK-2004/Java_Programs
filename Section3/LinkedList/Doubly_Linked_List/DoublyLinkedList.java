package april.Section3.LinkedList.Doubly_Linked_List;

public class DoublyLinkedList {

	Node head;
	Node tail;
	int size;

	class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
		}
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public boolean append(int data) {
		if (isEmpty()) {
			Node n = new Node(data);
			head = tail = n;
		} else {
			Node n = new Node(data);
			tail.next = n;
			n.prev = tail;
			tail = n;

		}
		size++;
		return true;
	}

	public void display() {
		if (isEmpty()) {
			return;
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + "<===>");
				temp = temp.next;
			}
		}

	}

	public boolean prepend(int data) {
		if (isEmpty()) {
			return append(data);
		} else {
			Node n = new Node(data);
			head.prev = n;
			n.next = head;
			head = n;
		}
		size++;
		return true;
	}

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
			temp.next.prev = n;
			temp.next = n;
			n.prev = temp;
		}
		size++;
		return true;
	}

	public boolean removeFirst() {
		if (isEmpty()) {
			return false;
		} else if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
			head.prev = null;
		}

		size--;
		return true;
	}

	public boolean removeLast() {
		if (isEmpty()) {
			return false;
		} else if (head == tail) {
			head = tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
		}
		size--;
		return true;
	}

	public boolean removeIndex(int index) {
		if (isEmpty()) {
			return false;
		} else if (head == tail) {
			head = tail = null;
		} else if (index == 0) {
			return removeFirst();
		} else if (index >= size - 1) {
			return removeLast();
		} else {
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;

		}

		return true;
	}
}
