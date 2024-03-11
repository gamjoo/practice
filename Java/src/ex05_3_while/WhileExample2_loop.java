package ex05_3_while;

public class WhileExample2_loop {
	public static void main(String args[]) {

		int cnt = 1; // 초기값
		while (cnt < 11) {
			System.out.println(cnt);
			cnt++;
			cnt++;
		}

		int cnt2 = 2;
		while (cnt2 < 11) {
			System.out.println(cnt2);
			cnt2++;
			cnt2++;
		}

// 복합대입연산자 활용. 더하고 찍은 경우
			
		int i;
		System.out.println("==홀수출력==");
		i = -1;
		while (i < 9) {
			i += 2; //복합대입연산자
			System.out.println(i);
		}

	}
}
