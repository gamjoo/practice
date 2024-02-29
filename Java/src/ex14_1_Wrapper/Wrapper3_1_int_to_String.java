/*
 * int -> String 만드는 방법 2가지
 * 	방법1. Integer.toString()사용
 *  방법2. + 연산자 사용
 */
package ex14_1_Wrapper;
class Wrapper3_1_int_to_String {
	public static void main(String args[]) {
		
		int i = 10;
		//방법 1. Integer.toString()사용
		String age = Integer.toString(i);
		
		//방법 2. + 연산자 사용. 문자열과 + 연산을 했을 때 문자열로 자동 형변환하는 시스템 활용
		String age2 = "" + i;
		
		System.out.println(age);
		System.out.println(age2);
		//String으로 형변환 됐는지 확인
		System.out.println(age.length());
		System.out.println(age2.length());
	}
}