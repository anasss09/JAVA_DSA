package Lecture_18;

public class powerRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, n = 3;
		System.out.println(pow(a, n));
	}

	public static int pow(int a, int n) {

		if (n == 0)
			return 1;

		return a * pow(a, n - 1);
	}

}
