package ex05_4_do_while;

import java.util.Scanner;

public class DoWhileExample2_2_문제 {
	/*
	 * 지역입력(exit=q)>서울 입력하신 지역은 서울입니다. 지역입력(exit=q)>부산 입력하신 지역은 부산입니다.
	 * 지역입력(exit=q)>q 입력하신 지역은 q입니다. 끝.
	 */
	public static void main(String args[]) {
		String location = "";
		Scanner sc = new Scanner(System.in);
		// 객체 공부할 때 좀 더 자세히
		// InputStream is = System.in;
		// Scanner sc = new Scanner(System.in);
		// 데이터 값을 입력한 변수가 아니라, 바로 데이터 값을 입력한 것임

		do {
			System.out.print("지역입력(exit=q)>");
			location = sc.next();

			System.out.println("입력하신 지역은 " + location + "입니다.");
		} while (!(location.equals("q")));
		// String 연산자 비교할 때는 ==, != 하는 게 아니라 equals 메서드 활용!!!
		// 부정하고 싶을 때는 전체에 괄호하고 ! 해주면 됨

		System.out.println("끝.");
		sc.close();

	}
}
