package ex08_17_interface_exception;

public class InterfaceExample {
	public static void main(String[] args) {
		SeparateVolume2 obj = new SeparateVolume2("8883ㅇ","나무","베르베르");

		printState(obj);
		try {
			obj.checkOut("수지", "2024-01-09");
			obj.checkOut("박보검", "2024-01-09");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		printState(obj);
		
		
	}

	static void printState(SeparateVolume2 obj) {
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
		
		
	}

}
