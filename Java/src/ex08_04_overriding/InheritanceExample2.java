package ex08_04_overriding;
class InheritanceExample2 {
	public static void main(String[] args) {
		CreditLineAccount obj = new CreditLineAccount("111-22-33333333",
				"홍길동", 100, 20000);

		try {
			int amount = obj.withdraw(500);
			//int amount = obj.withdraw(50000);
			System.out.println("인출액:" + amount);
			System.out.println("잔액:" + obj.balance);
			System.out.println("마이너스 한도:"+obj.creditLine);
		} catch (Exception e) {	//e라는 매개변수를 통해 new Exception에 저장된 메시지를 호출함
			System.out.println(e.getMessage());
			//String msg = e.getMessage();
			//System.out.println(msg);
		}
	}
}