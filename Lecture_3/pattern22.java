package Lecture_3;

public class pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int row = 1;
		int star = n;
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
			while (j <= star) {
				System.out.print("  ");
				j++;
			}

			// Star
			int k = 1;
			while (k <= star) {
				System.out.print("* ");
				k++;
			}

			// Next Line
			System.out.println();
			row++;
			star--;
			space += 2;
		}

	}

}
