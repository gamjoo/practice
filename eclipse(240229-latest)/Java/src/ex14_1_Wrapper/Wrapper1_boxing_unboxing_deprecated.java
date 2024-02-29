//Wrapper 클래스의 사용 예
package ex14_1_Wrapper;
public class Wrapper1_boxing_unboxing_deprecated {
	public static void main(String[] args) {
		
		//The constructor Integer(int) is deprecated since version 9
		//박싱 - 기본형 타입의 값을 객체로 변환
		//int -> Integer
		Integer obj1 = new Integer(12); //Integer 객체를 생성한다.
		Integer obj2 = new Integer(7);
		
		//언박싱 - 객체를 기본형 타입의 값으로 변환
		//Integer -> int
		int n1 = obj1.intValue();
		int n2 = obj2.intValue(); //Integer객체 안에 int값을 가져온다.
		int sum = n1+n2;
		System.out.println(sum);
		
		//String -> Integer
		Integer n02 = new Integer("20"); //박싱은 아니다. ("20")은 문자열로 기본형 아님
		
		//Integer -> int
		int n3 = n02.intValue(); //언박싱. 이로 인해 형변환 이뤄진다.
		sum = n1 + n2 + n3;
		System.out.println(sum);
		
	}

}
