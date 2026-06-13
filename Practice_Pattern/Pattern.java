package Practice_Pattern;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1;
		int n = 5;
		int star = n;
		int space = 0;

		while (row <= n) {

			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}

			row++;
			System.out.println();
			star--;
			space += 2;
		}
	}

}
