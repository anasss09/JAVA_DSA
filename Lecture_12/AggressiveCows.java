package Lecture_12;

import java.util.*;

public class AggressiveCows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int nos = sc.nextInt();// number of stall
			int noc = sc.nextInt();// number of cows
			int[] stall = new int[nos];
			for (int i = 0; i < stall.length; i++) {
				stall[i] = sc.nextInt();
			}
			Arrays.sort(stall);// NlogN
			System.out.println(largeCowplace(stall, noc));
		}

	}

	public static int largeCowplace(int[] stall, int noc) {
		int low = 0, n = stall.length;
		int high = stall[n - 1] - stall[0];
		int ans = 0;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (isItPosible(stall, noc, mid)) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		return ans;
	}

	private static boolean isItPosible(int[] stall, int noc, int mid) {
		int cow = 1; // first cow placed
		int pos = stall[0]; // position 1
		
		for (int i = 1; i < stall.length; i++) {
			if(stall[i] - pos >= mid) {
				cow++;
				pos = stall[i];
			}
			
			if(cow == noc) {
				return true;
			}
		}
		
		return false;
	}

}
