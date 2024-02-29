package ex13_8_clone_2;
class ObjectExample2 {
	public static void main(String[] args) {
		// 객체 생성
		Rectangle obj1 = new Rectangle(10, 20);

		// The method clone() from the type Object is not visible 에러 해결
		// clone 메소드로 객체를 복제한다.
		
		// Object imsi = obj1.clone()	//자식은 부모 것을 모두 사용할 수 있다.
		// Rectangle obj2 = (Rectangle)imsi;
		// Rectangle obj2 = (Rectangle)obj1.clone();
		Rectangle obj2 = obj1.clone();	//따로 형변환 과정을 거칠 필요가 없다.

		// 원본 객체와 복제 객체의 값을 출력한다.
		System.out.println("obj1 [" + obj1 + "]");
		System.out.println("obj2 [" + obj2 + "]");

		
		obj1.height = 300;
		obj1.width = 50;
		System.out.println("obj1 [" + obj1 + "]");
		System.out.println("obj2 [" + obj2 + "]");

	}

}
