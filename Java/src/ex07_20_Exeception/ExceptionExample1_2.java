package ex07_20_Exeception;

public class ExceptionExample1_2 {
	public static void main(String[] args) {
		int sum = 1 - 2;
		try {
			if (sum < 0) {
				throw new Exception("에러 발생"); // Exception 객체 생성
			}
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println("[catch]" + e.getMessage());
		}

	}

}