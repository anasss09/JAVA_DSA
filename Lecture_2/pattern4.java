package Lecture_2;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n - 1;
		int star = 1;
		int row = 1;
		
		while(row <= n) {
			// Space
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			
			//Star
			int j = 1;
			while(j <= star) {
				System.out.print("* ");
				j++;
			}
			// Next line preparation
			row++;
			star++;
			space--;
			System.out.println();
		}

	}

}
