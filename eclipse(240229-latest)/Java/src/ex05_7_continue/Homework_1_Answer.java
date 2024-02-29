package ex05_7_continue;

public class Homework_1_Answer {
	public static void main(String[] args) {
		System.out.println("============ 2023년 12월 ============");

		// 1~31까지 1씩 증가하고 한 줄에 7개씩 출력하기
		int i = -5;
		while (++i <= 31) {
			if (i <= 0) {
				System.out.printf("%5s", " ");
			} else {
				System.out.printf("%5d",i);
				if (i % 7 == 2)
					System.out.println();
			}
		}
	}

}
