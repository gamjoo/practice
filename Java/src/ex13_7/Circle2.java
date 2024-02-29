package ex13_7;

public class Circle2 {
	int radius; // 반지름

	Circle2(int radius) {
		this.radius = radius;
	}

	public String toString() {
		return "radius=" + radius;
	}

	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Circle2) {
			Circle2 sasu = (Circle2) obj;
			return this.radius == sasu.radius;
		} else
			return false;
	}
}