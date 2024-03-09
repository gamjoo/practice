package test;

public class Operator1 {

	public static void main(String[] args) {

		// 대입연산
		int weight = 80;
		weight = weight - 10;
		System.out.println(weight);
		
		int height = 180;
		height += 10;
		System.out.println(height);
		
		// 사칙연산+나머지 = 산술연산
		int a = 5+3;
		int b = 5-3;
		int c = 5*3;
		int d = 5/3;
		int e = 5%3;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		// 증감연산
		int x = 1;
		int y = 1;
		System.out.println(++x);
		System.out.println(y++);
		
		System.out.println(x);
		System.out.println(y);
	}

}
