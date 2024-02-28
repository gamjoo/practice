package ex05_3_while;

public class While_calander_Answer {
	public static void main(String[] args) {
		System.out.println("============ 2023년 12월 ============");

		// 1~31까지 1씩 증가하고, 한 줄에 7개 출력
		int i = -5;
		while (++i <= 31) { // i를 먼저 1 증가한 후 i<=31을 비교함
			if (i <= 0) {
				System.out.printf("%5s", " "); // 일단 있는 것으로 두고 공백을 넣기
			} else {
				System.out.printf("%5d", i);
				if (i % 7 == 2)
					System.out.println();
			}
		}
	}

}
