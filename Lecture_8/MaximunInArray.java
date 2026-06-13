package Lecture_8;

public class MaximunInArray {
	public static void main(String[] args) {
		int[] arr = { 12, 32, 45, 72, 43, 25 };

		System.out.println(maximun(arr));
	}

	public static int maximun(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
