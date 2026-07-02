package Lecture_22;

import java.util.*;

public class LexicographicalNumbers {

	public static void main(String[] args) {
		int n = 13;
//		List<Integer> ll = new ArrayList<>();
//		lexicographicalNumbers(n, 0, ll);
//		System.out.println(ll);

		List<String> lex = new ArrayList<>();
		System.out.println(lexicographicalNumbers(n, lex));
	}

//	Solution 1: Recursion

//	public static void lexicographicalNumbers(int n, int curr, List<Integer> ll) {
//		if (curr > n) {
//			return;
//		}
//		
//		if (curr != 0) {
//			ll.add(curr);
//		}
//		
//		int i = 0;
//
//		if (curr == 0) {
//			i = 1;
//		}
//		
//		for(; i <= 9; i++) {
//			lexicographicalNumbers(n, curr * 10 + i, ll);
//		}
//	}

	// Solution 2: Sorting
	public static List<Integer> lexicographicalNumbers(int n, List<String> lex) {
		List<Integer> lexAns = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			lex.add(String.valueOf(i));
		}
		
		Collections.sort(lex);
		
		for (int i = 0; i < lex.size(); i++) {
			lexAns.add(Integer.parseInt(lex.get(i)));
		}
		
		return lexAns;
	}

}
