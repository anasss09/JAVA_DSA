package Lecture_1;

public class LotteryCard {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 97;
		
		if(num >= 400 && num <= 500) {
			System.out.println("CAR");
			
		} else if(num >= 85 && num <= 105) {
			System.out.println("BIKE");
			
		} else if(num >= 135 && num <= 205) {
			System.out.println("KURKURE");
			
		} else {
			System.out.println("HAPPY BIRTHDAY");
		}
	}
}
