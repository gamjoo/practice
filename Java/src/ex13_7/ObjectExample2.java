/*
Object클래스에 정의된 toString()은 인스턴스에 대한 정보를
문자열(String)로 제공할 목적으로 정의한 것이다.
클래스를 작성할 때 toString()을 오버라이딩 하지 않으면 아래와 같이
정의된 내용이 그대로 사용된다.

	public String toStirng() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
		}
	- getClass()메소드와 hashCode()메소드 역시 Object클래스의 메소드이므로 호출할 수 있다.
	  해시 코드는 인스턴스의 주소와 관련된 값이다.
	- hashCode()메서드는 해싱(hashing) 기법에 사용되는 해시함수(hash function)를 구현한 것이다.
	(1) 해싱은 키를 이용해서 해시 테이블로부터 데이터를 가져오는 과정으로
		데이터 관리 기법 중의 하나로 다량의 데이터를 저장하고 검색하는 데 유용하다.
	(2) 해시함수는 찾고자하는 값을 입력하면 그 값이 저장된 위치를 알려주는 해시코드를 반환한다.
	(3) 해시테이블이란 키를 입력받아 해쉬 함수를 통해 얻은 해시코드에 대응하는 배열의 위치를 찾아
		데이터에 접근하는 자료구조이다.
		
	- Circle 인스턴스 두 개를 생성한 다음 각 인스턴스에 toString()을 호출한 결과를 출력했다.
 */
package ex13_7;
public class ObjectExample2 {
	public static void main(String[] args) {
		Circle2 obj1 = new Circle2(5);
		Circle2 obj2 = new Circle2(5);
		Object obj3 = (Object)obj1; //업캐스팅
		Object obj4 = new Object();
		

		System.out.println(obj1);
		System.out.println(obj2);
		
//		System.out.println(obj1.toString());
//		System.out.println(obj2.toString());
		
		
		if(obj1.equals(obj2))
			System.out.println("obj1.equals(obj2) : 같음");
		else
			System.out.println("obj1.equals(obj2) : 다름");
		
		//obj3는 업캐스팅 했으므로, Circle2로 형변환 할 수 있다.
		if(obj1.equals(obj3))
			System.out.println("obj1.equals(obj3) : 같음");
		else
			System.out.println("obj1.equals(obj3) : 다름");
		
		//obj4는 Circle2 타입으로 형변환할 수 없다
		if(obj1.equals(obj4))
			System.out.println("obj1.equals(obj4) : 같음");
		else
			System.out.println("obj1.equals(obj4) : 다름");
		
		//서로 다른 주소를 갖고 있으므로 다름이 당연하다.
		if(obj1==obj2)
			System.out.println("obj1==obj2 : 같음");
		else
			System.out.println("obj1==obj2 : 다름");
		
	}

}
