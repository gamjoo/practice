package ex17_15_Runnable_Interface_anonymous_ramda_method;

public class RamdaExample {
	public static void main(String[] args) {
		Parse p;
		
		//인터페이스 익명 구현 객체
		p = new Parse() {

			@Override
			public int toInt(String x) {
				return Integer.parseInt(x);
			}
			
			
		};
		System.out.println(p.toInt("100"));
		
		//방법 1.
		p = (String x) -> {
			return Integer.parseInt(x);
		};
		System.out.println(p.toInt("200"));
		
		//방법 2.
		//매개변수의 타입은 실행 도중 대입하는 값에 따라 자동으로 추론할 수 있으므로 생략 가능
		p = (x) -> {
			return Integer.parseInt(x);
		};
		System.out.println(p.toInt("300"));
		
		//방법 4.
		//매개변수가 하나만 있다면 괄호를 생략할 수 있다. but 매개 변수가 없으면 괄호가 꼭 있어야 한다.
		p = x -> Integer.parseInt(x);
		System.out.println(p.toInt("500"));
		
		//방법 5.
		/*
		 방법 4는 값 하나를 받아서 Integer.parseInt()에 넘겨주는 일을 하고 있다.
		 즉 하나의 메서드를 호출하고 있다.
		 이것을 메서드 참조방법으로 나타낼 수 있다.
		 메서드 참조는 클래스이름::메서드이름 또는 참조변수::메서드이름 형식으로 작성한다.
		 */
		p = Integer::parseInt;
		System.out.println(p.toInt("600"));
	}
}
