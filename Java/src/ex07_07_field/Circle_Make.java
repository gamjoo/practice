package ex07_07_field;

public class Circle_Make {
	public static void main(String[] args) {
		Circle obj = new Circle(3.5);
		double area = obj.getArea();
		System.out.println("원의 반지름 = "+obj.radius);
		System.out.println("원의 넓이 = "+area);
		
		obj.radius = 5.5;
		area = obj.getArea();
		System.out.println("원의 반지름 = "+obj.radius);
		System.out.println("원의 넓이 = "+area);
		
	}

}
