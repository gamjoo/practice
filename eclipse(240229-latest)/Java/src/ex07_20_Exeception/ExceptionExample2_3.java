//unchecked exception에 해당 - 컴파일 에러 없음
//실행시 에러 발생 - 예외 발생

package ex07_20_Exeception;

class ExceptionExample2_3 {
	public static void main(String[] args) {
		int num1 = 3, num2 = 0;

		try {
			int result = num1 / num2;
			System.out.println(result); //try문에서 오류발생하면 catch문장으로 넘어감
		} catch (java.lang.ArithmeticException e) {
			//ArithmeticException객체에 있는 에러 메시지를 가져온다.
			//new를 통해 선언 하지 않아도 객체가 생성되는 건가??
			String message = e.getMessage();
			System.out.println(message);

		}
	}
}