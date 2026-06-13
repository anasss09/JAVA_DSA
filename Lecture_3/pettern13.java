package Lecture_3;

public class pettern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;

		while (row <= 2 * n - 1) {

			// Star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}

			// Mirror
			if (row < n) {
				star++;
			} else {
				star--;
			}

			// Next Line
			System.out.println();
			row++;
		}
	}

}
