package ex05_2_switch;

public class SwitchExampe1_break {
	public static void main(String args[]) {
		int num = 3;
		switch (num) {
		case 1 :
			System.out.println("Good Moring, Java");
			break;
		case 2 :
			System.out.println("Good Afternoon, Java");
			break;
		case 3 :
			System.out.println("Good Evening, Java");
			break;
			default :
				System.out.println("Hello, Java");
		}
	}

}
