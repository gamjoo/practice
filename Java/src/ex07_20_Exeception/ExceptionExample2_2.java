//unchecked exception에 해당 - 컴파일 에러 없음
//실행시 에러 발생 - 예외 발생

package ex07_20_Exeception;

class ExceptionExample2_2 {
	public static void main(String[] args) {
		int num1 = 3, num2 = 0;

		try {
			int result = num1 / num2;
		} catch (java.lang.ArithmeticException e) {
			System.out.println("0으로 나누지 마세요~");

		}
	}
}