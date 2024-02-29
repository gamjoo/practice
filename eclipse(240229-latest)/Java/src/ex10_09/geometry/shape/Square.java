package ex10_09.geometry.shape;

import ex10_09.geometry.common.Polygon;

public class Square extends Polygon {
	
	public Square(int x, int y,int length) {
		super(4);				//슈퍼 클래스의 protected 생성자
		setPoint(0, x, y);		//슈퍼 크래스의 protected 메소드
		setPoint(1, x+length, y);
		setPoint(2, x+length, y+length);
		setPoint(3, x, y+length);
	}
	
	public int getX(int index) {
		return x[index];
	}
	// 부모 클래스에 있는 멤버는 선언하지 않고 쓸 수 있다
	
	public int getY(int index) {
		return y[index];
	}
}
