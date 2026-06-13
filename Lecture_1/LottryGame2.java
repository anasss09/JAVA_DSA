package Lecture_1;

public class LottryGame2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 97;
		
		if(num >= 400 && num <= 500) {
			if(num >= 400 && num <= 485) {
				System.out.println("THAR");
			} else {
				System.out.println("Creta");
			}
		} else if(num >= 85 && num <= 105) {
			if(num >= 85 && num <= 99) {
				System.out.println("Atlas");
			} else {
				System.out.println("Hero");
			}
		} else if(num >= 135 && num <= 205) {
			if(num >= 85 && num <= 99) {
				System.out.println("RED CHILLI");
			} else {
				System.out.println("GREEN CHILLI");
			}
		} else {
			System.out.println("HAPPY BIRTHDAY");
		}
	}
}
