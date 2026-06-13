package Lecture_3;

public class pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int space = n - 1;
		int star = 1;
		int row = 1;
		int count = 1;

		while (row <= n) {

			// Space
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}

			// Star
			int j = 1;
			while (j <= star) {
				System.out.print(count++ +"\t");
				j++;
			}

			// Next line
			row++;
			System.out.println();
			space--;
			star += 2;
		}
	}

}
