package Lecture_2;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int row = 1;
		int space = 0;
		int star = n;
		
		while(row <= n) {
			
			// Space
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			
			// Star
			int j = 1;
			while(j <= star) {
				System.out.print("* ");
				j++;
			}
			
			
			// Next line prep
			row++;
			space += 2;
			star--;
			System.out.println();
		}
	}

}
