package ex10_09.main;

import ex10_09.geometry.common.*;

public class AccessControlExample0_error {
	public static void main(String[] args) {
		//다른 패키지에서 protected 생성자 접근 불가하다.
		Polygon obj = new Polygon(4);
	}

}
