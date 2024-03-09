package ex05_3_while;

public class WhileExercise2 {
	public static void main(String[] args) {
		
		int a = 9;
		while (a>=0) {
			System.out.println(a);
			a--;
		}

		//좀 더 간편하게
		int cnt=9;
		while (cnt>=0) {
			System.out.println(cnt--);
		}

	}

}
