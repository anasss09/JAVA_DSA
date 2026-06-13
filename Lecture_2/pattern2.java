package Lecture_2;
import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int star = 1;
		int row = 1;
		int n = 5;
				
		while(row <= n) {
			// Star 
			
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			// Next line preparation
			row++;
			star++;
			System.out.println();
		}
	}

}
