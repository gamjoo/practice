package ex07_08_private_field;

public class Circle {
	//접근 제어자 private은 클래스 내부에서만 접근 가능하다.
	//동일 package내의 다른 class에서는 접근할 수 없음 not visibleFieldExample1_method.java
	private double radius;
	
	final double PI = 3.14;
	
	Circle (double radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return radius*radius*PI;	
	}

}
