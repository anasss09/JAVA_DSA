package Lecture_18;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 123;
		int rev = 0;
		
		System.out.println(reverseNumber(n, rev));
	}
	
	public static int reverseNumber(int n, int rev) {
		
		if(n == 0) {
			return rev;
		}
		
		int ld = n % 10;
		
		return reverseNumber(n / 10, rev * 10 + ld);
	}

}
