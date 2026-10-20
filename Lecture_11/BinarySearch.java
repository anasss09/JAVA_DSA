package Lecture_11;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 6, 9, 13, 14, 16, 18, 20, 21, 23, 25 };
		int target = 18;

		System.out.println(binarySearch(nums, target));
	}

	public static int binarySearch(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] == target) {
				return nums[mid];
			} else if (nums[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;
	}

}
