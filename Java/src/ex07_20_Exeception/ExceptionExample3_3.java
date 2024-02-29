//checked exception을 던지는 메서드
//컴파일 에러 발생
//throws Exception를 가진 메서드 호출시 try~catch문으로 처리

package ex07_20_Exeception;

class ExceptionExample3_3 {
	public static void main(String[] args) {
		try {
			int result = add(0, -1); 
			System.out.println(result);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//throws Exception : throw에 의해 발생한 에러를 호출한 메서드(여기서는 main)로 넘긴다.
	static int add(int a, int b) throws Exception {
		int result = a + b;
		if (result < 0)
			throw new Exception("0보다 작아 에러 발생합니다.");
		System.out.println("나는 출력이 될까요?");
		return result;
	}
}
	