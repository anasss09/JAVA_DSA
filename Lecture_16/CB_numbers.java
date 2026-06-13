package Lecture_16;

import java.util.*;

public class CB_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String s = sc.next();

		System.out.println(count_CB_Numbers(s));
	}

	public static int count_CB_Numbers(String s) {

		boolean[] visited = new boolean[s.length()];
		int count = 0;
		int i = 0;

		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				i = j - len;
				long num = Long.parseLong(s.substring(i, j));
				
				if(isCBNumber(num) && isNotVisited(visited, i, j - 1)) {
					// mark
					for(int k = i; k < j; k++) {
						visited[k] = true;
					}
					count++;
				}
			}
		}

		return count;

	}

	public static boolean isCBNumber(long num) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

		if (num == 0 || num == 1) {
			return false;
		}

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return true;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isNotVisited(boolean[] visited, int si, int ei) {

		for (int i = si; i <= ei; i++) {
			if (visited[i]) {
				return false;
			}
		}

		return true;
	}

}
