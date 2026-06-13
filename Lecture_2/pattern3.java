package Lecture_2;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 1;
		int n = 5;
		int star = n;
		
		while(row <= n) {
			
			// Star
			int i = 1;
			
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			
			// Next line prep
			row++;
			star--;
			System.out.println();
		}
	}

}
