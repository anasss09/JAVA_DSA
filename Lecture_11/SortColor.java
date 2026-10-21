package Lecture_11;

import java.util.Arrays;

public class SortColor {

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };

		sortColor(nums);

		System.out.println(Arrays.toString(nums));
	}

	public static void sortColor(int[] nums) {
		int zero = 0;
		int two = nums.length - 1;
		int i = 0;

		while (i <= two) {
			if (nums[i] == 0) {
				// swap(i, zero)
				int temp = nums[i];
				nums[i] = nums[zero];
				nums[zero] = temp;

				zero++;
				i++;

			} else if (nums[i] == 2) {
				// swap(i, two);
				int temp = nums[i];
				nums[i] = nums[two];
				nums[two] = temp;

				two--;

			} else {
				i++;
			}
		}
	}

}
