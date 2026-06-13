package Lecture_3;

public class pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;
		int star = n / 2;
		int space = 1;

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
			while (k <= star) {
				System.out.print("* ");
				k++;
			}

			// Mirror
			if (row < n / 2 + 1) {
				space += 2;
				star--;
			} else {
				space -= 2;
				star++;
			}

			// Next Line
			row++;
			System.out.println();

		}
	}

}
