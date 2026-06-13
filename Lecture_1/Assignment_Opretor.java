package Lecture_1;

import java.util.Scanner;

public class Assignment_Opretor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(armstrong(num));
	}

	public static boolean armstrong(int num) {
		int digit = 0;
		int sum = 0;
		int ld = 0;
		int digits = num;
		int num2 = num;

		while (digits > 0) {
			digit++;

			digits = digits / 10;
		}

		while (num > 0) {
			ld = num % 10;

			sum += Math.pow(ld, digit);
			System.out.println("Sum: " + sum);

			num = num / 10;
		}
		if (sum == num2) {
			return true;
		} else {
			return false;
		}
	}

}
