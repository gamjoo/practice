package ex13_8_clone_0;
class ObjectExample2 {
	public static void main(String[] args) {
		// 객체 생성
		Rectangle obj1 = new Rectangle(10, 20);

		// The method clone() from the type Object is not visible
		// clone 메소드로 객체를 복제한다.
		Rectangle obj2 = (Rectangle) obj1.clone();

		// 원본 객체와 복제 객체의 값을 출력한다.
		System.out.println("obj1 [" + obj1 + "]");
		System.out.println("obj2 [" + obj2 + "]");

		
		obj1.height = 100; obj1.width = 200;
		System.out.println("obj1 [" + obj1 + "]");
		System.out.println("obj2 [" + obj2 + "]");

	}

}
