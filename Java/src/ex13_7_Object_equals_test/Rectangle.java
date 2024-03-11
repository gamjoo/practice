package ex13_7_Object_equals_test;

public class Rectangle {
	int width, height;

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public String toString() {
		String result = "가로는 " + width + ", 세로는 " + height;
		return result;
	}
	
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Rectangle) {
			Rectangle sasu = (Rectangle)obj;
			return this.height == sasu.height && this.width == sasu.width;
		} else
			return false;
		
	}

}