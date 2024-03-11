package ex03_4_casting;

public class casting1_int_double {
	public static void main(String[] args) {

		int i1 = 10; // 정수형 변수 i1에 10 대입

		// 1. 자동 형변환, 묵시적 형변환, 암시적 형변환
		// 자동 형변환은 변수에 값을 저장하거나 메서드의 인자값이 매개변수로 전달될 때
		// 자료형이 일치하지 않는 경우 컴파일러가 자동으로 형변환을 해줌
		// dobule d1 = (double)i1;
		double d1 = i1;
		System.out.println("d1 데이터는 " + d1 + "입니다.");
	}

}
