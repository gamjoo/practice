package ex08_14_02_interface;

public class InterfaceExample1 {
	public static void main(String ars[]) {
		SeparateVolume obj1 = new SeparateVolume("863ㅂ774개", "개미","베르베르");
		
		obj1.checkOut("홍길동","2024-01-09");
		obj1.checkIn();
	}

}