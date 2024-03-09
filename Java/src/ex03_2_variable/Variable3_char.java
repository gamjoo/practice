//기본형 변수의 값을 출력
//정렬 ctrl + shift + F
package ex03_2_variable;

public class Variable3_char {
	public static void main(String[] args) {

		System.out.println("=====문자형 변수=====");
		// 문자형 변수 - 하나의 문자를 나타낼 수 있는 자료형
		// 16비트의 유니코드를 사용함
		char c1 = 'A';
		char c2 = '@';
		char c3 = '가';
		System.out.println("c1=" + c1 + " c2=" + c2 + " c3=" + c3);

		/*
		 * 에러의 예 1. char cerror='AB'; 두 글자 입력하면 에러 2. char cerror_blank= ''; 싱글코트 안에 반드시
		 * 하나의 문자 필요
		 */

		/*
		 * 컴퓨터가 숫자밖에 모르기 때문에 문자가 숫자로 변환되어 저장됨 문자에 해당하는 유니코드로. A -> 65 : 문자를 코드로 변환하는 것을
		 * 문자 인코딩(encoding) 65 -> A : 코드를 문자로 변환하는 것을 문자 디코딩(decoding)
		 */
		// 문자형에 정수를 배정하면 정수에 해당하는 유니코드를 찾아서 변수에 저장
		char c4 = 65;
		char c5 = '\uAC00';
		System.out.println("c4=" + c4 + " c5=" + c5);
	}
}
