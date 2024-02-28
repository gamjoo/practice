package ex05_7_continue;

public class ContinueExample2_1 {
	public static void main(String[] args) {

		for (int cnt = 0; cnt < 10; cnt++) {
			if (cnt != 5)
				System.out.println(cnt);
		}

		System.out.println("=========================");

		for (int cnt = 0; cnt < 10; cnt++) {
			if (cnt == 5)
				continue; // 다음 실행문으로 넘어가지 말고, 다음 반복으로 넘어가라..

			System.out.println(cnt);
		}

		System.out.println("End.");

	}

}
