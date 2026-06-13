package Lecture_2_3_assignment;

import java.util.Scanner;

public class Hollow_Rhombus_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int fisrtSpace = n - 1;
		int midSpace = n / 2 + 1;
		int stars = n;

		while (row <= n) {
			// Outer Space
			int i = 1;
			while (i <= fisrtSpace) {
				System.out.print(" ");
				i++;
			}
			// First and Last line
			if (row == 1 || row == n) {
				// Star
				int j = 1;
				while (j <= stars) {
					System.out.print("*");
					j++;
				}
			} else {
				// Inner Space
				int k = 1;
				System.out.print("*");
				while(k <= midSpace) {
					System.out.print(" ");
					k++;
				}
				System.out.print("*");
			}

			// Next line
			row++;
			fisrtSpace--;
			System.out.println();
		}
		sc.close();
	}

}
