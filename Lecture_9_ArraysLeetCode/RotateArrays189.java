package Lecture_9_ArraysLeetCode;

import java.util.*;

public class RotateArrays189 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		reversalAlgorithm(nums, k);

		System.out.println(Arrays.toString(nums));
	}

	public static void reversalAlgorithm(int[] nums, int k) {
		int n = nums.length;

		reverse(nums, 0, n - k - 1);

		reverse(nums, n - k, n - 1);

		reverse(nums, 0, n - 1);
	}

	public static void reverse(int[] nums, int first, int last) {

		while (first < last) {
			int temp = nums[first];
			nums[first] = nums[last];
			nums[last] = temp;

			first++;
			last--;
		}

	}

}
