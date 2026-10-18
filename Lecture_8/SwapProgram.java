package Lecture_8;

public class SwapProgram {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 4, 6, -9 };

		System.out.println(arr[0] + " " + arr[1]);
		swap(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

//	public static void swap(int i, int j) {
//		int temp = i;
//		i = j;
//		j = temp;
//	}

}
