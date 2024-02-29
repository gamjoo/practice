package ex03_4_casting;

public class Casting2_error {
	public static void main(String[] args) {
		
		//오류 원인과 해결법은?
		//1.float형인데, 값에 접미사 f를 붙이지 않음 (double형으로 설정됨)
		//2.casting
		float ft = (float) 3.14;
		System.out.println(ft);
	}

}
