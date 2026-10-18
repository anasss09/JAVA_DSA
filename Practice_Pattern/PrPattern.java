package Practice_Pattern;

public class PrPattern {

//	public static void main(String[] args) {
//		int n = 5;
//		int row=1;
//		int star = 1;
//		
//		
//		while(row <= n) {
//			
//			// Star
//			int i = 1;
//			while(i <= star) {
//				System.out.print("* ");
//				i++;
//			}
//			
//			// Next Line ki prep
//			row++;
//			System.out.println();
//			star++;
//		}
//	}

//	public static void main(String[] args) {
//		int n = 5;
//		int space = n-1;
//		int star = 1;
//		int row = 1;
//		
//		while(row <= n) {
//			
//			// Space
//			int i = 1;
//			while(i <= space) {
//				System.out.print("  ");
//				i++;
//			}
//			
//			// Star
//			int j = 1;
//			while(j <= star) {
//				System.out.print("* ");
//				j++;
//			}
//			
//			// Next line ki prep
//			System.out.println();
//			star++;
//			space--;
//			row++;
//			
//		}
// 	}

	public static void main(String[] args) {
		int row = 1;
		int n = 5;
		int space = n - 1;
		int star = 1;

		while (row <= n) {

			// Space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// Star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}

			// Next Line
			star += 2;
			space--;
			System.out.println();
			row++;
		}
	}

}
