//Circle 클래스 안에 선언된 필드를 사용하는 프로그램

package ex07_07_field;

public class Circle_FieldExample1_method_sameclass {
	public static void main(String[] args) {
		Circle obj = new Circle(3.5);
		Circle_FieldExample1_method_sameclass.print(obj);
		//동일한 class 안에 static method가 정의된 경우 메소드를 호출할 때 앞에 '클래스명.'을 생략할 수 있다.

		obj.radius = 5.5;
		print(obj);

	}

	private static void print(Circle obj) {
		// double area = obj.getArea();
		// System.out.println("원의 넓이 = " + area);

		System.out.println("원의 반지름 = " + obj.radius);
		System.out.println("원의 넓이 = " + obj.getArea());

	}

}