package ex09_13_Test2.answer03;

public class InterfaceExample {
	public static void main(String[] args) {
		SeparateVolume obj = new SeparateVolume("8883ㅇ", "나무", "베르베르");

		printState(obj);
		obj.checkOut("수지", "2024-01-09");
		printState(obj);

	}

	static void printState(SeparateVolume obj) {
		// 인터페이스 Lendable을 구현하지 않은 클래스에서의 사용법
		// 인터페이스.상수
		if (obj.state == BookState.STATE_NORMAL) {
			System.out.println("--------------------");
			System.out.println("대출상태: 대출가능");
			System.out.println("--------------------");
		} else if (obj.state == BookState.STATE_BORROWED) {
			System.out.println("--------------------");
			System.out.println("대출상태: 대출중");
			System.out.println("대출인: " + obj.borrower);
			System.out.println("대출일: " + obj.checkOutDate);
			System.out.println("--------------------");
		}

	}
}