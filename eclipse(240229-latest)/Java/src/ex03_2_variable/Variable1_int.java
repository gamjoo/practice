//기본형 변수의 값을 출력해 봅니다.
//변수 : 단 하나의 값을 저장할 수 있는 메모리 공간
package ex03_2_variable;
public class Variable1_int {
	public static void main(String[] args) {
		System.out.println("=======정수형 변수=======");
		//정수형 변수
		byte b = 10;   //1바이트(작은 범위의 값을 저장하기에 유용)
		short s = 100;  //2바이트
		int i = 1000;   //4바이트
		long l = 10000L;
		//8바이트(l[소문자 엘] 또는 L을 숫자 뒤에 붙임)
		System.out.println(b);
		
		
	
		//문자열 + 변수의 경우 문자열 내용이 출력되고 b 값이 출력됨
		//여기서 +는 더하기 개념이 아닌 문자열 연결을 의미함
		//+를 기준으로 문자열이 앞 또는 뒤에 존재하면 모두 문자열 취급
		System.out.println("b=" + b); //b=10
		System.out.println("s=" + s);
		System.out.println("i=" + i + " l=" + l);
		
		
		System.out.println("b=" + b + 1);
		System.out.println("s=" + s + 1);
		//b=10:문자열 먼저 연결. 그 뒤에 또 문자 연결 -> 문자열101  
		System.out.println("b=" + (b + 1));
		System.out.println("s=" + (s + 1));
		//괄호로 우선순위 지정해주면 b=11 연산결과 출력 가능
		
	}

}


