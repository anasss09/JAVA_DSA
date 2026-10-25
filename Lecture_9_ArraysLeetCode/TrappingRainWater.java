package Lecture_9_ArraysLeetCode;

import java.util.*;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] nums = { 5, 3, 1, 2, 7, 4, 1, 6 };

		System.out.println(trappingWater(nums));
	}

	public static int trappingWater(int[] arr) {
		int sum = 0;
		int n = arr.length;
		int[] left = new int[n];
		int[] right = new int[n];

		// Prefix
		left[0] = arr[0];
		for (int i = 1; i < right.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}

		// Suffix
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]);
		}

		// Trap 
		
		for (int i = 0; i < right.length; i++) {
			sum += Math.min(left[i], right[i]) - arr[i];
		}
		
		return sum;
	}

}
