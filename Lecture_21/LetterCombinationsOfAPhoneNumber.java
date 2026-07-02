package Lecture_21;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		List<String> ll = new ArrayList();
		String digit = "23";
		
		letterCombination(digit, "", ll);
		System.out.println(ll);
	}

	public static void letterCombination(String digit, String ans, List<String> ll) {
		
		if(digit.length() == 0) {
			ll.add(ans);
			return;
		}
		
		char ch = digit.charAt(0);
		String press = key[ch - '0'];
		
		for(int i = 0; i < press.length(); i++) {
			letterCombination(digit.substring(1), ans + press.charAt(i), ll);
		}
	}

}
