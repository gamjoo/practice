package ex17_16_ArrayList;
import java.util.ArrayList;

/*	와일드 카드(?)
 *  제네릭 타입을 매개값이나 리턴 타입으로 사용할 때 구체적인 타입 대신 와일드 카드를 사용할 수 있다.
 *  1. <?> 	=> 타입 파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올 수 있다.
 *  		=> <? extends Object> 줄임 표현, Unbounded WildCard라고 한다.
 *  2. <? extends 상위타입> => 타입 파라미터를 대치하는 구체적인 타입으로 특정 클래스를 상속받은 클래스로 제한
 *  3. <? super 하위타입> => 타입 파라미터를 대치하는 구체적인 타입으로 특정 클래스와 그 클래스의 상위 클래스로 제한
 */

public class WildTest {
	
	public static void main(String[] args) {
		//Integer 자료형 list2 객체 생성
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(Integer.valueOf(3));
		
		//Double형 list3 생성
		ArrayList<Double> list3 = new ArrayList<Double>();
		list3.add(10.1);
		list3.add(11.2);
		list3.add(12.3);
		
		//static 메소드 호출
		printData(list2);
		printData(list3);
		
	}

	private static void printData(ArrayList<? extends Number> list3) {
//		for (int i=0; i<list3.size(); i++) {
//			System.out.println(list3.get(i));
//		}
				
		for (Object x : list3)
			System.out.println(x);
	}


}
