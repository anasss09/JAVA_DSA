package Lecture_11;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;

		System.out.println(binarySearch(arr, target));
	}
	
	public static int binarySearch(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2; // 1

			if (nums[mid] == target) {
				return mid;
			} else if (nums[low] <= nums[mid]) { // Upper line
				if (nums[low] <= target && nums[mid] > target) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else { // Lower line
				if (nums[high] >= target && nums[mid] < target) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}

		return -1;
	}

}
