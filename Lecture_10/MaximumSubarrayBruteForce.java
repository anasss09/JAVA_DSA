package Lecture_10;

public class MaximumSubarrayBruteForce {

	public static void main(String[] args) {
		int[] nums = { 5, 4, -1, 7, 8 };

		System.out.println(maximum(nums));
	}

	public static int maximum(int[] nums) {
		int ans = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				ans = Math.max(ans, sum);
			}
		}
		return ans;
	}

}
