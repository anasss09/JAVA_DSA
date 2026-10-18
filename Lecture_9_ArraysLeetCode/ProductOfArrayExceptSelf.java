package Lecture_9_ArraysLeetCode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };

		productArray(nums);
	}

	public static int[] productArray(int[] nums) {
		int n = nums.length;
		int[] left = new int[n];
		int[] right = new int[n];

		// Prefix Excluding Index Product
		left[0] = 1;
		for (int i = 1; i < right.length; i++) {
			left[i] = left[i - 1] * nums[i - 1];
		}

		// Suffix Excluding Index Product
		right[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * nums[i + 1];
		}
		
		// Answer Calculation
		for (int i = 0; i < right.length; i++) {
			left[i] = left[i] * right[i];
		}
//		System.out.println(Arrays.toString(left));
		
		return left;
	}

}
