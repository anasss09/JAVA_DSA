package Lecture_7;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 371;

		System.out.println(isArmstrong(num));
	}

	public static boolean isArmstrong(int num) {
		int temp = num;
		int count = 0;
		int calculate = 0;

		while (temp > 0) {

			count++;
			temp = temp / 10;

		}

		temp = num;

		while (temp > 0) {
			int ld = temp % 10;
			calculate += Math.pow(ld, count);

			temp = temp / 10;
		}

		if (calculate == num) {
			return true;
		} else {
			return false;
		}

	}

}
