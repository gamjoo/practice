package ex07_00_object;

public class Saram_make3 {
	public static void main(String[] args) {

//		The constructor Saram3() is undefined
		Saram3 s = new Saram3("아이유");
		s.w = 43.0;
		s.ki = 162.1;
		s.age = 31;
		s.eat();
		s.sesu();
		s.walk();

		Saram3 k = new Saram3("장범준");
		k.w = 64.0;
		k.ki = 172.0;
		k.age = 34;
		k.eat();
	}
}
