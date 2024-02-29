package ex08_16_interface_constant;

public class InterfaceExample_Solution {
	public static void main(String[] args) {
		SeparateVolume obj = new SeparateVolume("863ㅂ","나무","베르베르");
		
		//대출가능을 확인하고 대출상태가 가능하면 "대출가능"을 출력하고
		//대출중이면 대출중과 대출인, 대출일을 출력한다.
		
		printState(obj);
		
		obj.checkOut("홍길동", "2024-01-09");
		
		printState(obj);
		
		
	}

	static void printState(SeparateVolume obj) {
		//인터페이스 Lendable을 구현하지 않은 클래스에서의 사용법
		//인터페이스.상수
		if (obj.state == Lendable.STATE_NORMAL) {
			System.out.println("--------------------");
			System.out.println("대출상태: 대출가능");
			System.out.println("--------------------");
		} else if (obj.state == Lendable.STATE_BORROWED) {
			System.out.println("--------------------");
			System.out.println("대출상태: 대출중");
			System.out.println("대출인: "+obj.borrower);
			System.out.println("대출일: "+obj.checkOutDate);
			System.out.println("--------------------");

		}
		
//		System.out.print("--------------------");
//		System.out.println();
//		if (obj.state == 0) {
//			System.out.println("대출상태: 대출가능");
//			System.out.println("--------------------");
//		} else {
//			System.out.println("대출상태: 대출중");
//			System.out.println("대출인:" + obj.borrower);
//			System.out.println("대출일:" + obj.checkOutDate);
//			System.out.print("--------------------");
//		}
		
		
	}

}
