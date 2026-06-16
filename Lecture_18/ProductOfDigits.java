package Lecture_18;

public class ProductOfDigits {
	public static void main(String[] args) {
		int n = 234;

		System.out.println(productSum(n));
	}

	public static int productSum(int n) {
		if (n == 0) {
			return 1;
		}

		int ld = n % 10;

		return ld * productSum(n / 10);
	}

}
