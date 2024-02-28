package ex04_06_arithmetic_op;
public class Oper01_0 {
	public static void main(String[] args) {
	/*
	 * 1. 연산자 : 연산(수나 식을 일정한 규칙에 따라 계산하는 것)을
	 * 수행하는 기호 ex) + - * /
	 * 
	 * 2. 피연산자 : 연산의 대상
	 * 
	 * 3. 식 : 연산자와 피연산자를 조합하여 계산하고자 한느 바를 표현한 것
	 * 예) x + 3
	 * x와 3은 피연산자, +는 연산자
	 * 4. 식을 계산하여 결과를 얻는 것을 식을 평가(evaluation)한다고 함
	 */
		// 선언과 초기화가 여러 개 반복되는 경우 이렇게 한 줄로 적을 수 있음
		int a = 10, b = 4, c;
		c = a + b;
		System.out.println(a+"+"+b+"="+c);
		c = a - b;
		System.out.println(a+"-"+b+"="+c);
		c = a * b;
		System.out.println(a+"*"+b+"="+c);
		c = a / b;
		System.out.println(a+"/"+b+"="+c);

		c = a % b;
		System.out.println(a+"%"+b+"="+c);
		System.out.printf("%d %% %d=%d%n",a,b,c); //printf 형식 잘보기!!

		// a/b = 2.5. a와 b 둘 중 하나를 실수로 캐스팅 하면,
		// 값을 담아내는 변수도 실수로 캐스팅?
		double C = (double) a / b;
		System.out.println(a+"/"+b+"="+C);
		
		// 답 : Casting을 활용
		System.out.println("a/b = " + a/b);
		System.out.println("(double)(a/b) = " + (double)(a/b));
		System.out.println("(double)a = " + (double)a);
		System.out.println("(double)a/b = " + (double)a/b);
		System.out.println("a/(double)b = " + a/(double)b);
		System.out.println("(double)a/(double)b = " + (double)a/(double)b);
		System.out.println(a + "/" + b + "=" + (double)a/b);
	}

}
