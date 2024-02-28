package ex06_3_method_intro3_return;

public class MethodExample2 {
	public static void main(String[] args) {
		
		hap(1,10); //아무것도 출력되지 않습니다.
		
		/////호출된 메서드로 돌아와서 값을 출력할 때////
		//1. result sum의 값을 저장해서 출력하는 방법
		int result = hap(1,100);
		System.out.println("1: result = " + result);
		
		//2. 출력문에서 메서드 호출하는 방법
		System.out.println("출력문 안에서 호출 : " + hap(1,5));
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
