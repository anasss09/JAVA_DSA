package Lecture_9_ArraysLeetCode;

import java.util.*;

public class FindPivotIndex {

	public static void main(String[] args) {
		int[] nums = { 1, 7, 3, 6, 5, 6 };

		System.out.println(isPivotIndex(nums));
	}

	public static int isPivotIndex(int[] nums) {
		int n = nums.length;
		int[] left = new int[n];
		int[] right = new int[n];

		// Prefix
		left[0] = 0;
		for (int i = 1; i < right.length; i++) {
			left[i] = left[i - 1] + nums[i - 1];
		}

		// Suffix
		right[n - 1] = 0;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] + nums[i + 1];
		}

		// answer
		for (int i = 0; i < right.length; i++) {
			int num = left[i] - right[i];

			if (num == 0) {
				return i;
			}

			left[i] = num;
		}
		
		return -1;
	}

}
