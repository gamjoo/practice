package ex07_00_object;
public class Saram6 {
	//필드(멤버변수)
	String name;
	double w;
	double ki;
	int age;
	
	//생성자 - 반드시 클래스 이름과 똑같고 리턴 타입이 없어야 한다.
	Saram6(String name, double w, double ki, int age) {
		/*
		 * this란?
		 * 자바는 객체를 참조할 수 있도록 this 키워드를 제공한다.
		 * 참조변수로 this에는 인스턴스 자신의 주소가 저장되어 있다.
		 * 생성자와 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재한다.
		 * this는 참조변수로 인스턴스 자신을 가리킴.
		 */
		this.name = name;
		this.w = w;
		this.ki = ki;
		this.age = age;
	}
	
	Saram6(double w2, String name2) {
		name=name2;
		w=w2;
	}

	//메서드 'static' 없음 -> 객체를 생성해야 한다.
	public void eat() {
		System.out.println(name + "이(가) 밥을 먹는다.");
	}
	public void walk() {
		System.out.println(name + "이(가) 걷기전 몸무게는 " + w + "입니다.");
	}	
	public void sesu() {
		System.out.println(name +"이(가) 세수한다.");
	}

}
