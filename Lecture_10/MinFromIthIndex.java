package Lecture_10;

import java.util.Arrays;

public class MinFromIthIndex {

	public static void main(String[] args) {
		int[] nums = { 4, -1, 5, 3, 2, 1, 7 };

		SelectionSort(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void SelectionSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			int minIndex = minFrom_ithIndex(nums, i);
			
			int temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;
			
		}
	}

	public static int minFrom_ithIndex(int[] nums, int indx) {
		int minIndex = indx;

		for (int i = indx; i < nums.length; i++) {
			if (nums[i] < nums[minIndex]) {
				minIndex = i;
			}
		}

		return minIndex;
	}

}
