//복제 가능한 클래스로 만들기
//1단계 - Cloneable 인터페이스 구현
//2단계 = clone()메소드 오버라이드
package ex13_8_clone_2;

//Cloneable인터페이스가 구현되어 있다는 것은 클래스 작성자가 복제를 허용한다는 의미
public class Rectangle implements Cloneable {
	int width, height;

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	/* 공변 반환 타입(covariant return type)-JDK1.5부터 적용
	 * 오버라이딩 할 때 조상 메소드의 반환타입을 자손 클래스의 타입으로 변경을 허용하는 것이다.
	 * 즉, 반환형을 Object에서 자손 클래스 타입으로 변경을 허용한다.
	 * 
	 * 	장점 : clone()호출 후 형 변환이 필요 없다. (main 메소드)
	 * 		Rectangle obj2 = (Rectangle) obj1.clone();
	 * 	==> Rectangle obj2 = obj1.clone();
	 *
	 */
	public Rectangle clone() {//변경된 곳 : Object형 -> Rectangle형으로 변경
		try {
			//슈퍼 클래스의 clone메소드를 호출해서 그 결과를 리턴
			return (Rectangle) super.clone(); //변경된 곳 : Rectangle형으로 변환
		}
		// 슈퍼 클래스의 clone메소드가 발생하는 exception을 처리
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
	public String toString() {
		String result = "x= " + width + ", y=" + height;
		return result;
	}
	
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Rectangle) {
			Rectangle r = (Rectangle)obj;
			return this.width == r.width && this.height == r.height;
		} else
			return false;
		
	}

}