package Lecture_16;

public class length_Wise_Substring {
	public static void main(String[] args) {
		String s = "CODING";

		lenthWise(s);
	}

	public static void lenthWise(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				i = j - len;
				System.out.println(s.substring(i, j));
			}
		}
	}
}
