package ex05_6_break;

public class BreakExample2_2 {
	public static void main(String args[]) {

		int cnt, cnt2;

		for (cnt2 = 0; cnt2 < 3; cnt2++) {
			for (cnt = 0; cnt < 5; cnt++) {
				System.out.println("(" + cnt2 + ", " + cnt + ")");
				if ((cnt2 == 1) && (cnt == 2))
					break; // break를 내포하는 반복문 밖으로 제어가 이동합니다.
							// 안쪽for문에 break 걸면, 안쪽 for문 밖으로 이동함.
			}

		}
		System.out.println("End.");

	}
}