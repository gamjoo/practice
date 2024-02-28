// equals메소드 사용 예 - 똑같은 값을 갖는 두 개의 객체를 생성
/*
 * Object 클래스의 equals()메소드
 * 1. 매개변수로 객체의 참조변수를 받아서 비교하여 그 결과를 boolean 값으로 알려주는 역할을 한다.
 * 2. 다음은 equals메소드의 실제 내용이다.
 * 		public boolean equals(Object arg0) {
 *			return this == arg0;
 * 		}
 * 3. 두 객체의 같고 다름을 참조변수의 값으로 판단하고 있다.
 * 4. 서로 다른 두 객체를 equals 메소드로 비교하면 항상 false 결과를 얻게 된다.
 */

package ex13_6_Object_equals;
import java.util.GregorianCalendar;
public class ObjectExample {
	public static void main(String[] args) {
		GregorianCalendar obj1 = new GregorianCalendar(2021, 5, 2);
		GregorianCalendar obj2 = new GregorianCalendar(2021, 5, 2);

		System.out.println(obj1);
		System.out.println(obj2);

		System.out.println(obj1.toString()); // 오버라이딩 되어 있다(골뱅이@ 없으니까;;)
		System.out.println(obj2.toString());

		// 별도로 객체 생성을 한 각각의 참조변수는 서로 다른 주소를 갖는 게 당연하다.
		if (obj1 == obj2)
			System.out.println("obj1==obj2 : 같음");
		else
			System.out.println("obj1==obj2 : 다름");
		
		if (obj1.equals(obj2))
			//Object안에 있는 equals 메소드는 오버라이딩 되어 있다.
			//오버라이딩 돼서 같음으로 나옴.
			System.out.println("obj1.equals(obj2):같음");
		else
			System.out.println("obj1.equals(obj2):다름");
	}

}
