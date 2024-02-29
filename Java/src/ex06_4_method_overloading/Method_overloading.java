//오버로딩을 이용한 print() 메서드 정의 및 호출
/*
 * 자바는 메서드 시그니처를 사용해 메서드를 구분한다.
 * 메서드 시그니처 (Method Signature)는
   메서드 이름, 매개변수 개수, 데이터 타입, 순서를 의미한다.
   하나라도 다르면 다른 메서드로 정의하는 것을 메서드 오버로딩이라고 한다.
 * 자바는 반환형으로 메서드를 구분하지 않는다.
 */

package ex06_4_method_overloading;

public class Method_overloading {
	//매개변수 없는 메서드 - 1
	public static void print() {
		System.out.println("print()메서드 입니다.");
		return;
	} 
	
	//매개변수 한 개를 갖는 메서드 - 2
	public static void print(int num) {
		System.out.println("print(int num)메서드 입니다.");
	}
	
	//매개변수 두 개를 갖는 메서드 - 3
	public static void print(int num, char data) {
		System.out.println("print(int num, char data)메서드 입니다.");
	}
	
	//매개변수 두 개를 갖는 메서드 - 매개변수 자료형의 순서가 다르다. - 4
	public static void print(char num, int data) {
		System.out.println("print(char num, int data)메서드 입니다.");
	}
	
/*	 3번과 동일한 메서드로 취급한다.
	Duplicate method print(int, char) in type Method_overloading	
	public static String print(int num, char data) {
		System.out.println("print(int num, char data)메서드 입니다.");
	}
*/
	
	// main메서드에서 정의된 메서드를 활용하려면, 인자(arguments)를 활용하면 됨
	public static void main(String[] args) {
		print();
		print(10);
		print(10, 'a');
	}
}
