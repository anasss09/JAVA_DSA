package Lecture_32;

public class LinkedListClient {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addlast(10);
		list.addlast(20);
		list.addlast(30);
		list.addfirst(40);
		list.addAtIndex(9, 3);
		list.Display();	
	}
}
