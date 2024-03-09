package ex06_3_method_intro3_return;

public class MethodExample1 {
	public static void main(String[] args) {
		
		hap(1,10); //아무것도 출력되지 않습니다.
		
	}

			         //반환형
	public static      int   hap(int start, int end) {//메서드 정의
		int sum=0;
		for (int i=start; i<=end; i++) {
			sum += i;
		}
		return sum; //sum의 자료형과 메서드의 반환형이 일치해야 함
	}
}
