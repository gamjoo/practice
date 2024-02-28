package ex05_7_continue;

public class Homework_3 {
	public static void main(String args[]) {
		
		for (int a=5; 1<=a&&a<=5; a--) {
			for (int b=1; 0<=b&&b<=a; b++)
			System.out.print("*");
			System.out.println();
		}
	}

}

// 한 줄씩 찍는다고 생각하고 접근하면, 규칙 보임.