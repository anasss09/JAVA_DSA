package Lecture_32;

import java.util.Iterator;

public class LinkedList {

	private class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public void addfirst(int item) {
		Node nn = new Node(item);
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	public void addlast(int item) {
		Node nn = new Node(item);

		if (size == 0) {
			addfirst(item);
		} else {
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	private Node getNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}

		return temp;
	}

	public void addAtIndex(int item, int k) {
		if (size == 0) {
			addfirst(item);
		} else if (k == size) {
			addlast(item);
		} else {
			Node prev = getNode(k - 1);
			Node nn = new Node(item);
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}
	}

	public void Display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
	}
}
