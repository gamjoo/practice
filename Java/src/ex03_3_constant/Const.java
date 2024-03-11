package ex03_3_constant;
//상수 : 값을 한 번만 저장할 수 있는 공간
//상수 만드는 법 : 변수 타입 앞에 키워드 final만 붙여 주면 됨
//일반적으로 상수의 이름은 대문자로 사용
public class Const {
	public static void main(String args[]) {
		final int MAX = 500; // MAX=1000; 등 다른 값을 입력할 수 없음
		System.out.println(MAX);
	}

}
