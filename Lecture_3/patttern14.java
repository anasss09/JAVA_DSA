package Lecture_3;

public class patttern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int row = 1;
		int star = 1;
		int space = n - 1;

		while (row <= 2 * n - 1) {

			// Space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

			// Star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}

			// Mirror
			if (row < n) {
				star++;
				space--;
			} else {
				star--;
				space++;
			}

			// Next Line
			System.out.println();
			row++;
		}
	}

}
