/* 객체 지향 프로그래밍의 주요 특징 중 하나인 캡슐화는 클래스 멤버를
   클래스 내부에 감추는 것이다. 클래스 멤버를 외부에서 조작할 수 없도록
   은닉하기 위해 private을 사용한다.
   하지만 일부 멤버는 외부 클래스가 사용할 수 있도록 공개해야 한다.
*  예로 리모컨은 복잡한 내부 회로를 캡슐화해서 은폐하지만 전원 버튼,
   음량 조절 버튼 등은 외부에 노출해서 사용할 수 있게 한다.
   이처럼 클래스 내부에 은닉한 필드를 외부에서 사용할 수 있도록
   Getter와 Setter를 제공한다.
   일반적으로 Getter는 get, Setter는 set으로 시작하는 이름을 사용한다.
   radius 필드에 접근 하기 위해서 getRadius(), setRadius()메서드를 사용한다.
*/
package ex07_08_private_field;

public class Circle2 {
	// 접근 제어자 private은 클래스 내부에서만 접근 가능하다.
	// 동일 package내의 다른 class에서는 접근할 수 없음 not visibleFieldExample1_method.java
	private double radius;

	final double PI = 3.14;

	Circle2(double radius) {
		this.radius = radius;
	}

	double getArea() {
		return radius * radius * PI;
	}

	// getter 메서드 - radius값을 모르지만 값을 출력하고 싶음
	// radius의 반환형을 입력해야 함. get+첫글자는 대문자
	public double getRadius() {
		return radius;
	}

	// setter 메서드 - radius값을 모르지만 값을 변경하고 싶음
	// 반환형은 void로. set+첫글자는 대문자
	public void setRadius(double radius) {
		this.radius = radius;
	}

}
