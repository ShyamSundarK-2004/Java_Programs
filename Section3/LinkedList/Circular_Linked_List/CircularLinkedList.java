package april.Section3.LinkedList.Circular_Linked_List;

public class CircularLinkedList {
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

	public boolean append(int data) {
		if (isEmpty()) {
			Node n = new Node(data);
			head = tail = n;
			tail.next = head;
		} else {
			Node n = new Node(data);
			tail.next = n;
			tail = n;
			tail.next = head;
		}
		size++;
		return true;
	}

	public void display() {

		if (isEmpty()) {
			return;
		} else {
			Node temp = head;
			do {
				System.out.print(temp.data + " ---> ");
				temp = temp.next;
			} while (temp != head);
			System.out.print(head.data + "{Head}");

		}

	}

	public boolean prepend(int data) {
		if (isEmpty()) {
			Node n = new Node(data);
			head = tail = n;
			tail.next = head;
		} else {
			Node n = new Node(data);
			n.next = head;
			head = n;
			tail.next = n;
		}
		size++;
		return true;
	}

	public boolean add(int index, int data) {

		if (isEmpty()) {
			append(data);
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
			size++;
		}
		return true;

	}

	public boolean removeFirst() {
		if (isEmpty()) {
			return false;
		} else if (head == tail) {
			head = tail = null;
			size--;
		} else {
			head = head.next;
			tail.next = tail.next.next;
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
			temp.next = head;
		}
		size--;
		return true;
	}

	public boolean removeIndex(int index) {
		if (isEmpty()) {
			return false;
		} else if (index >= size - 1) {
			return removeLast();
		} else if (head == tail) {
			head = tail = null;
			size--;
		} else if (index == 0) {
			return removeFirst();
		} else {
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			size--;
		}

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
			do {
				if (temp.data == data) {
					return i;
				}
				temp = temp.next;
				i++;
			} while (temp != head);
		}
		return -1;

	}

}
