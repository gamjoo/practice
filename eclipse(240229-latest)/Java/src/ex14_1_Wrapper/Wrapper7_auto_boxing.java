//기본형 값 -> Wrapper 객체로의 자동(오토) Boxing
package ex14_1_Wrapper;
public class Wrapper7_auto_boxing {
	public static void main(String args[]) {
		
		//double타입의 값을 가지고 Double타입 매개변수를 사용하는 메소드를 호출한다.
		printDouble(123.45);
		//printDouble(Double.valueOf(123.456D)); 로 변환된다.
	}
	
	//자동(오토) Boxing
	static void printDouble(Double obj) {
		System.out.println("obj.doubleValue() = " + obj.doubleValue());
		System.out.println("obj.toString() = " + obj.toString());
	}

}
