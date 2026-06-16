package Lecture_18;

public class PIcode {

	public static void main(String[] args) {
		int n = 5;
		PI(n);
	}

	public static void PI(int n) {
		if(n == 0) {
			return;
		}
		PI(n - 1);
		System.out.println(n);
	}

}
