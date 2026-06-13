package Lecture_3;

public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;
		int star = n / 2 + 1;
		int space = -1;

		while (row <= n) {

			// Star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}

			// Space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

			// Star
			int k = 1;
			while(k < star) {
				System.out.print("* ");
				k++;
			}
			
			// NEXT LINE
			row++;
			System.out.println();
		}
	}

}
