package ex07_08_private_field;

import java.util.Scanner;

public class Circle_final_example {
	public static void main(String[] args) {
		System.out.print("반지름을 입력하세요>");
		Scanner sc = new Scanner(System.in);
		
		
//		double num = sc.nextDouble();
//		굳이 이렇게 num이라는 변수에 담을 필요 없었음
//		Circle obj = new Circle(num);
//		obj.radius = num;
		
		Circle obj = new Circle(sc.nextDouble());
		
		
		//not visible : 접근권한이 없다.
		System.out.println("원의 반지름 = "+obj.radius);
		System.out.println("원의 넓이 = "+obj.getArea());
	
		sc.close();
	}

}
