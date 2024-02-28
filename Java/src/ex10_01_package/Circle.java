package ex10_01_package;

//only public, abstract & final are permitted
private class Circle {

	private double radius;
	
	final double PI = 3.14;
	
	Circle (double radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return radius*radius*PI;	
	}

}
