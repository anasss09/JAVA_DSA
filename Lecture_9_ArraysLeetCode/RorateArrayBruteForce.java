package Lecture_9_ArraysLeetCode;

import java.util.*;

public class RorateArrayBruteForce {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		rotate(nums, k);
	}

	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n;

		for (int j = 1; j <= k; j++) {
			// 1st Rotation
			int last = nums[n - 1];

			for (int i = n - 1; i > 0; i--) {
				nums[i] = nums[i - 1];
			}

			nums[0] = last;
		}

		System.out.println(Arrays.toString(nums));

	}

}
