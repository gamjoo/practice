package ex07_00_object;

public class Saram {
	//필드(멤버변수)
	String name;
	double w;
	double ki;
	int age;
	
	//생성자
	Saram(){
		
	}
	
	//메서드 'static' 없음 -> 객체를 생성해야 한다.
	public void eat() {
		System.out.println("밥을 먹는다.");
	}
	
	//메서드
	public void walk() {
		System.out.println("걷는다.");
	}	
	//메서드
	public void sesu() {
		System.out.println("세수한다.");
	}

}
