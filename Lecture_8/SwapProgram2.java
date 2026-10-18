package Lecture_8;

public class SwapProgram2 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] other = { 100, 200, 300, 400, 500 };

		System.out.println(arr[0] + " " + other[0]); // 10 100
		swap(arr, other);
		System.out.println(arr[0] + " " + other[0]); // 100 10
	}

	public static void swap(int[] arr, int[] other) {
		int[] temp = arr;
		arr = other;
		other = temp;
	}

}
