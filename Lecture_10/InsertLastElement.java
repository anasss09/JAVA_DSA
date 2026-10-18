package Lecture_10;

import java.util.Arrays;

public class InsertLastElement {

	public static void main(String[] args) {
		int[] nums = { 9, 8, 1, 7, 4, 2, 11 };

		for (int i = 1; i < nums.length; i++) {
			insertAtIndex(nums, i);
		}
		
		System.out.println(Arrays.toString(nums));
	}

	public static void insertAtIndex(int[] nums, int i) {
		int j = i - 1; // 0
		int item = nums[i]; // 8

		while (j >= 0 && nums[j] > item) {
			nums[j + 1] = nums[j];
			nums[j] = item;
			j--;
		}
	}

}
