package Lecture_10;

import java.util.*;

public class Selection_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] nums = new int[num];
		
		for(int i = 0; i < num; i++) {
			nums[i] = sc.nextInt();
		}

		Sort(nums);
		
		for(int i = 0; i < num; i++) {
			System.out.println(nums[i]);
		}
	}

	public static void Sort(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			int mini = min_from_ith_idx(nums, i);
			int temp = nums[mini];
			nums[mini] = nums[i];
			nums[i] = temp;

		}
	}

	public static int min_from_ith_idx(int[] nums, int idx) {
		int mini = idx;

		for (int i = idx; i < nums.length; i++) {
			if (nums[i] < nums[mini]) {
				mini = i;
			}
		}

		return mini;
	}

}
