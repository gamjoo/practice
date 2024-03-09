package ex05_3_while;

public class WhileExercise3_calander {
	public static void main(String[] args) {
		
//		int date = 1;
//		while (date <= 31) {
//			System.out.printf("%5d",date++);
//			if (date%7==1) {
//				System.out.println();
		

//		캘린더 logic		
		int i = 0;
		while (++i <= 31) {
			System.out.printf("%5d",i);
			if(i%7 == 0) {
				System.out.println();
		
		}
		

		}
	}

}
