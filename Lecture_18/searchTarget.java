package Lecture_18;

public class searchTarget {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 4 };
		int n = 0;
		int target = 4;
		
		System.out.println(accure(arr, target, n));
	}

	public static int accure(int[] arr, int target, int n) {

		if(n == arr.length ) {
			return -1;
		}
		
		if(arr[n] == target) return n;
		
		return accure(arr, target, n + 1);
	}

}
