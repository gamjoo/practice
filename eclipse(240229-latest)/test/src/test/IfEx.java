package test;

public class IfEx {

	public static void main(String[] args) {
		
		// if문
		int score = 50;
		
		if (score >= 60) {
			System.out.println("합격");
		}

		// if else문
		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		// if else if문
		score = 50;
		String grade = "";
		if (score >= 90) {
			grade = "A+";
		} else if (score >= 80) {
			grade = "A";
		} else if (score >= 70) {
			grade = "B";
		} else if (score >= 60) {
			grade = "C";
		} else {
			grade = "D";
		}
		System.out.println(grade);
	}

}
