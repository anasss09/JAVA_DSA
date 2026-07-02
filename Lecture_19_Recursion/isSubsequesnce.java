package Lecture_19_Recursion;

public class isSubsequesnce {
	public static void main(String[] args) {
		String str = "abc";
		
		IsSubsequence(str, "");
	}

	public static void IsSubsequence(String str, String ans) {
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		char ch = str.charAt(0);
		IsSubsequence(str.substring(1), ans);
		IsSubsequence(str.substring(1), ans + ch);
	}
}
