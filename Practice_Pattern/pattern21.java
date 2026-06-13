package Practice_Pattern;

public class pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1;
		int n = 4;
		int star = 1;
		int space = n * 2 - 3;


		while (row <= n) {

			int i = 1;
			int count = 1;
			while (i <= star) {
				System.out.print(count + " ");
				i++;
				count++;
			}

			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

			int k = 1;

			if (row == n) {
				k = 2;
			}
			count = 1;
			while (k <= star) {
				System.out.print(count + " ");
				if(k <= star / 2) {
					count++;
				} else {
					count--;
				}
				k++;
			}

			row++;
			System.out.println();
			star++;
			space -= 2;
		}
	}

}
