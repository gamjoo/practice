package ex07_00_object;

public class Saram_make {
	public static void main(String[] args) {
/*
 	다른 클래스에 있는 필드나 메서드를 사용하려면 먼저 객체를 생성해야 함
 	생성된 객체 멤버에 접근하려면 마침표(.)연산자를 사용함.
 	예) 참조변수.필드, 참조변수.메서드()
 */
//		클래스	참조변수	=	연산자	생성자호출
		Saram     s     =    new     Saram();
		s.name="아이유";
		s.w=43.0;
		s.ki=162.1;
		s.age=31;
		s.eat();
		
		Saram k = new Saram();
		k.name="장범준";
		k.w=64.0;
		k.ki=172.0;
		k.age=34;
		k.eat();
		k.sesu();
	}

}
