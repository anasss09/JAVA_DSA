package Lecture_28;

public class Stack {

	private int[] arr;
	private int idx = -1;

	public Stack() {
		this(5);
	}

	public Stack(int n) {
		arr = new int[n];
	}

	public boolean isEmpty() {
		return idx == -1;
	}

	public void push(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Stack is Full.");
		}
		arr[++idx] = item;
	}

	public int size() {
		return idx + 1;
	}

	public boolean isFull() {
		return size() == arr.length;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty.");
		}

		int x = arr[idx--];
		return x;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Full.");
		}
		
		int x = arr[idx];
		return x;
	}

	public void Display() {
		for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
