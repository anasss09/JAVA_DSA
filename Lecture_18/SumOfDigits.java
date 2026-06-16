package Lecture_18;

public class SumOfDigits {

	public static void main(String[] args) {
		int n = 123;

		System.out.println(sumDigit(n));
	}

	public static int sumDigit(int n) {
		
		if(n == 1) {
			return 1;
		}
		
		int ld = n % 10;
				
		int sum = sumDigit(n / 10);
		return sum + ld;
		
	}

}
