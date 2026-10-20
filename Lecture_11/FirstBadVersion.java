package Lecture_11;

public class FirstBadVersion {

	public static boolean firstBadVersion(int n) {
		int bad = 4;
		return n >= bad;
	}

	public static void main(String[] args) {
//		System.out.println(firstBadVersion(4));

		int n = 5;
	
		System.out.println (isBadVersion(n));
	}
	
	public static int isBadVersion(int n) {
		int low = 1;
		int high = n;
		int ans = 0;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (firstBadVersion(mid)) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return ans;
	}

}
