/*
1. input()
	기능 : 정수를 입력 받는 메서드
	반환형 : 입력 받은 정수형을 리턴한다.

2. abs(int data)
	기능 : 절대값 구하기
	매개변수 : 정수형 한 개
	반환형 : 매개변수로 입력받은 정수형 값을 절대값으로 구한 뒤 리턴

출력결과)
정수를 입력 하세요? -3
절대값 : 3
 */
package ex06_3_method_intro3_return;

import java.util.Scanner;

public class MethodExample2_abs_input {

	public static int input() { // 매개변수가 필요할까?
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 하세요?");
		int value = sc.nextInt();
		sc.close();

		return value;
	}

	public static int abs(int data) {
		if (data >= 0) {
		} else {
			data = (-(data));
		}
		return data;
	}

	public static void main(String[] args) {
		int inputdata = input();
		// 1. input method를 호출해서 정수를 입력 받고, 변수 inputdata에 대입
		int result = abs(inputdata);
		// 2. 1에서 입력받은 정수를 abs 매서드의 매개변수로 활용하여 결과값 출력
		// int reuslt = abs((input());
		System.out.println("절대값 :" + result);
	}
}