package Lecture_4;

public class sumOfAllDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 97436;
		int sum = 0;
		int ld = 0;

		for (int i = 1; i <= n; i++) {
			ld = n % 10;
			n = n / 10;
			sum += ld;
		}
		System.out.println(sum);
	}

}
