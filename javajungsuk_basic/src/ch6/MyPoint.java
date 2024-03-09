package ch6;

public class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int x1, int y1) {
		return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
	}

}