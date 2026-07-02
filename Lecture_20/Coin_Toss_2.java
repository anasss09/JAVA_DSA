package Lecture_20;

public class Coin_Toss_2 {

	public static void main(String[] args) {
		int n = 4;

		coinToss(n, "");

	}

	public static void coinToss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if(ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			coinToss(n - 1, ans + "H");
		}
		coinToss(n - 1, ans + "T");
	}

}
