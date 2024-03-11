package ex06_2_method;

public class MethodExample6 {

	
	//접근제어자 : 어떤 페키지에서도 접근할 수 있다   객체생성없이접근가능   반환되는 값의 자료형     메서드이름(매개변수 목록)
	   public 								    static            void             main(String[] args) {
		   int num = 50;
		   //num 변수가 갖고 있는 값을 print()안에서 출력하려면 어떻게 해야 할까?
		   print(num);	//메서드의 괄호안에 값을 넣어준다
		   				//메서드를 정의한 곳에서 num 값을 저장하기 위한 변수를 선언해 주어야 함
	   }

	//메서드 정의
	   public static void print() {
		   System.out.println("print() 메서드 입니다.");
		   
	   }

}