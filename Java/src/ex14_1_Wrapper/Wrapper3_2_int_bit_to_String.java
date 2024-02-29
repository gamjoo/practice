/*
 * primitive 타입의 비트 패턴을 문자열로 리턴하는 메소드
 * 1. toBinaryString 메소드 : 2진수 - 0 1
 * 2. toOctalString 메소드 : 8진수 - 0 1 2 3 4 5 6 7
 * 3. toHexString 메소드 : 16진수 0 1 2 3 4 5 6 7 8 9 a b c d e f
 */

package ex14_1_Wrapper;

public class Wrapper3_2_int_bit_to_String {
	public static void main(String args[]) {
		int sum=0;
		
		for(String arg : args) {
			//인자로 받은 문자열을 int타입의 값으로 바꾸어서 합산한다.
			sum += Integer.parseInt(arg);
		}
		
		System.out.println("합은 = " + sum);
		System.out.println("10진수:" + sum + "\t 2진수 문자열:" + Integer.toBinaryString(sum));
		System.out.println("10진수:" + sum + "\t 8진수 문자열:" + Integer.toOctalString(sum));
		System.out.println("10진수:" + sum + "\t 16진수 문자열:" + Integer.toHexString(sum));

	}
}
