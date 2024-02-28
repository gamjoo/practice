//unchecked exception을 던지는 메서드. 컴파일 당시에는 오류 없음
//throws 절이 없어도 try~catch문으로 예외 처리 가능
//정수는 0으로 나누는 것이 금지되어 ArithmeticException 발생한다.

package ex07_20_Exeception;

class ExceptionExample4_1 {
	public static void main(String[] args) {
		int result = devide(3, 0);
		System.out.println(result);
	}
	
	static int devide(int a, int b) {
		int result = a / b;
		return result;
	}
}