package ex06_2_method;

public class MethodExample4 {

	
	//접근제어자 : 어떤 페키지에서도 접근할 수 있다   객체생성없이접근가능   반환되는 값의 자료형     메서드이름(매개변수 목록)
	   public 								    static            void             main(String[] args) {
		   print(); //메서드 호출
		   print(); //메서드 호출할 때마다 실행
	}
	   
	//메서드 정의
	   public static void print() {
		   System.out.println("print() 메서드 입니다.");
		   
	   }

}