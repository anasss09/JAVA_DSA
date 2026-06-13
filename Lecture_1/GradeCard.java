package Lecture_1;

public class GradeCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark = 57;
		
		if(mark >= 75) {
			System.out.println("A");
			
		} else if(mark >= 65 && mark <= 75) {
			System.out.println("B");
			
		} else if(mark >= 55 && mark <= 65) {
			System.out.println("C");
			
		} else if(mark >= 45 && mark <= 45) {
			System.out.println("Pass");
			
		} else {
			System.out.println("Fail");
		}
	}

}
