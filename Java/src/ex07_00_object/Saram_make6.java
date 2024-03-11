package ex07_00_object;

public class Saram_make6 {
	public static void main(String[] args) {
		Saram6 s = new Saram6("아이유", 47.4, 162.1, 31);
		//Saram5 s = new Saram5(47.4, "아이유"); 둘 중 어느 하나로 고르면 된다
		//s.name = "아이유";
		//s.w = 43.0;
		//s.ki = 162.1;
		//s.age = 31;
		s.eat();
		s.sesu();
		s.walk();

		Saram6 k = new Saram6("장범준",64.0,172.0,34);
		//saram5 k = new Saram5(64,"장범준"); 둘 중 어느 하나로 고르면 된다
		//k.name = "장범준";
		//k.w = 64.0;
		//k.ki = 172.0;
		//k.age = 34;
		k.eat();
	}
}
