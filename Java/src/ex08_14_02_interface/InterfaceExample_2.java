package ex08_14_02_interface;

public class InterfaceExample_2 {
	public static void main(String ars[]) {
		SeparateVolume obj1 = new SeparateVolume("863ㅂ774개", "개미","베르베르");
		
		obj1.checkOut("홍길동","2024-01-09");
		obj1.checkIn();
		
		AppCDInfo obj2 = new AppCDInfo("1000-2000","베토벤 운명");
		obj2.checkOut("홍길동","2024-01-09");
		obj2.checkIn();
	}

}