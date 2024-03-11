/*
 * 1.지네릭스(Generics) jdk 1.5에서 처음 도입
 * 	다양한 타입의 객체들을 다루는 메소드나 컬렉션 클래스에 컴파일 시 타입체크를 해주는 기능이다.
 * 
 * 2.클래스 옆에 꺽쇠(<>)기호를 이용해서 만듭니다.
 * 	1) <>안에 특정 자료형(Wrapper 클래스, String, 사용자 정의 클래스형-참조형)을 넣어주면 된다.
 *  2) API 형식 표기
 *  	- Class ArrayList<E> : E의 ArrayList라고 읽는다.
 *  	- E(타입 매개 변수) : 기호의 종류만 다를 뿐 임의의 참조형 타입을 의미한다.
 *  
 *  타입 매개 변수 : 의미
 *  		E : 원소(Element)
 *  		K : 키(key)
 *  		T : 타입(Type)
 *  		V : 값(Value)
 *  
 *  - 사용 예)
 *  	List<String>		list = new ArrayList<String>();
 *  	ArrayList<String>	list = new ArrayList<String>();
 *  	ArrayList<Integer>	list = new ArrayList<Integer>();
 *  	ArrayList<Dolbue>	list = new ArrayList<double>();
 *  
 */
package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayList3_Generics {
	public static void main(String args[]) {
		// ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<String>();

		// list에 3개의 데이터 추가
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");

		int num = list.size(); // list에 있는 데이터 수를 구하는 메소드

		// list에 있는 데이터의 수만큼 반복하면서 데이터를 가져와 출력
		for (int cnt = 0; cnt < num; cnt++) {
			// get(index)메소드를 사용하여 index위치에 있는 자료를 가져온다.
			String str = list.get(cnt);
			System.out.println(str);
		}

		System.out.println("===== 향상된 for문 =====");
		for (String str : list) {
			System.out.println(str);
		}
	}

}


