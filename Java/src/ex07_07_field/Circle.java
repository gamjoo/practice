package ex07_07_field;

public class Circle {
	double radius;
	
	Circle (double radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return radius*radius*3.14;	
	}

}
