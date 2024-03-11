package ex05_7_continue;

public class Homework_2_Answer {
	public static void main(String[] args) {
		int line = 5;
		for (int count = 1; count <= line; count++) {
			for (int j = 1; j <= count; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
