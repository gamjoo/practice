package ex03_1_literal;
public class Literal1_println {
	public static void main(String args[]) {
		 /*
		  * 1. System.out.println() : 괄호안의 내용을 출력한 후 한 행을 띄운다.
		  * 2. System.out.print() : 괄호안의 내용을 출력한 후 한 행을 띄지 않고 유지
		  * 3. System.out.printf() : 서식을 지정해서 출력합니다.
		  * 	형식: System.out.printf("포맷 명시자", 데이터)
		  * 	주의점: %로 시작하는 포맷 갯수와 데이터의 갯수가 일치해야 합니다. 
		  */
		// 리터럴(literal)- 문자가 가리키는 값 그 자체. 기존에 알고 있던 '상수'의 다른이름. (12, 123, 3.1. 'A' ...)
		System.out.println("출력성공!!"); //문자열 ""
		System.out.println(30); //정수
		System.out.println(3.14); //실수
		System.out.println('A'); //문자''는 문자 딱 하나 올때	
		System.out.println(true); //논리(boolean)
		System.out.println(false);
		System.out.println("문자열 출력"); //문자열
		System.out.println("===== println() 끝 =====");
		
	}

}