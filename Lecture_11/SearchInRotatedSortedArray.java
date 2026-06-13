package Lecture_11;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;

		int low = 0;
		int high = arr.length;

		while (low <= high) {
			int mid = (low + high) / 2;
			
			if(arr[mid] == target) {
//				return mid;
			}
		}
	}

}
