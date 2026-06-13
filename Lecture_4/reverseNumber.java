package Lecture_4;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 97436;
		int ld = 0;
		int reverse = 0;

		for (int i = 0; i < n; i++) {
			ld = n % 10;
//			System.out.println(ld);
			reverse = reverse * 10 + ld;
			n = n / 10;
		}
		
		System.out.println(reverse);
	}

}
