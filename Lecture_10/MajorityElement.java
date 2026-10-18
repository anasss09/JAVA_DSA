package Lecture_10;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };

		System.out.println(boyerMoore(nums));
	}

	public static int boyerMoore(int[] nums) {
		int elected = nums[0];
		int vote = 1;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == elected) {
				vote++;
			}

			if (vote == 0) {
				elected = nums[i];
				vote = 1;
			}
		}

		return elected;
	}

}
