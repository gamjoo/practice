/*
 1. 최댓값을 구하는 메서드는 max
 2. 최솟값을 구하는 메서드는 min
 3. 두 메서드 모두 반환형은 int, 매개변수는 모두 정수형 2개
 4. main()에서 아래와 같은 작업을 진행
 	(1) 2개의 값을 입력받는다
 	(2) 두 개의 값을 인자로 max(), min()을 호출한다
 	(3) 호출 후 리턴된 값을 아래와 같이 출력되도록 한다
 		출력결과)
 				두 개의 정수를 입력하세요?10 20
 				max = 20
 				min = 10
 */
package ex06_3_method_intro3_return;

import java.util.Scanner;

public class MethodExample3_max_min_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력 하세요?");
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		sc.close();
		
		int max2 = max(value1, value2);
		int min2 = min(value1, value2);
		
		//max2는 변수, max(value1, value2)의 max는 메소드 명칭
		System.out.println("max = "+max2);
		System.out.println("min = "+min2);
		
	}	
	
	public static int max(int a, int b) {
		return a>b?a:b;
		
	}
	
	public static int min(int a, int b) {
		return a<b?a:b;
		
	}
	

}

