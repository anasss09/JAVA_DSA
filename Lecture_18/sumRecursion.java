package Lecture_18;

public class sumRecursion {

	public static void main(String[] args) {
		int n = 4;
		
		System.out.println(Sum(n));
	}
	
	public static int Sum(int n) {
		if(n == 0) {
			return 0;
		}
		
		int sum = Sum(n - 1);
		return sum + n;
	}

}
