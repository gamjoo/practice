package ex07_18_singleton;

public class Singleton_main {
	public static void main(String[] args) {
		//Singleton obj1 = new Singleton(); //에러 발생
		//Singleton obj2 = new Singleton(); //에러 발생
		//무조건 new를 사용해야 객체를 생성할 수 있는 게 아니라, 이런 방식으로도 객체 생성 가능
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		
		//하나의 객체를 계속 사용. 
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}

}
