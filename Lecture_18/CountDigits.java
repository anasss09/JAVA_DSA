package Lecture_18;

public class CountDigits {

	public static void main(String[] args) {
		int n = 9876;
		int count = 0;

		System.out.println(countDigit(n, count));

	}

	public static int countDigit(int n, int count) {

		if (n == 0) {
			return 0;
		}

		int ld = n % 10;
		return (count + 1) + countDigit(n / 10, count);
	}

}
