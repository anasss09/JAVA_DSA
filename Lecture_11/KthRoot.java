package Lecture_11;

public class KthRoot {

	public static void main(String[] args) {
		// x^k <= 149 Maximum number that setisfy condition
		// 5 Anaswer

		// Linear Search
//		
//		int x = 1;
//		int k = 3;

//		while(Math.pow(x, k) <= 149) {
//			x++;
//		}
//		
//		System.out.println(x-1);

		int k = 3;
		int low = 1;
		int n = 149;
		int high = n;
		int ans = 0;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (Math.pow(mid, k) <= n) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		System.out.println(ans);

	}

}
