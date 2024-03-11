//unchecked exception에 해당 - 컴파일 에러 없음
//실행시 에러 발생 - 예외 발생

package ex07_20_Exeception;

class ExceptionExample2_4 {
	public static void main(String[] args) {
		int num1 = 3, num2 = 0;

		try {
			int result = num1 / num2;
			System.out.println(result);
		} catch (java.lang.ArithmeticException e) {
			//JVM에서 처리 후 객체생성 후 주소값 e를 넘겨줌.
			//참조변수인 e는 이제 ArithmeticException class를 참조할 수 있음
			String message = e.getMessage();
			System.out.println(message);

		} finally {
			System.out.println("여기까지 왔어요~");
		}
	}
}