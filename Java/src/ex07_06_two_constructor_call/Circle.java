package ex07_06_two_constructor_call;

public class Circle {
	double radius;
	
	Circle (double radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return radius*radius*3.14;	
	}

}
