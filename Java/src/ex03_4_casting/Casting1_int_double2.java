package ex03_4_casting;

public class Casting1_int_double2 {
	public static void main(String[] args) {
		
		double d2=10.12345;
		
		//2.명시적 형변환
		//에러발생 - Type mismatch: cannot convert from double to int
		int i2 = (int) d2;
	}

}
