package ex08_01_inheritance;

//은행 계좌 클래스를 상속받는 직불 계좌 클래스
//은행 계좌 클래스(Account)			- 슈퍼 클래스(상속을 해주는 클래스)
//직불 계좌 클래스(CheckingAccount)	- 서브 클래스(상속을 받는 클래스)

class InheritanceExample {
	public static void main(String[] args) {
		CheckingAccount obj = new CheckingAccount();
		
		obj.accountNo = "111-22-33333333"; //상속받은 필드
		obj.ownerName = "홍길동"; //상속받은 필드
		obj.cardNo = "5555-6666-7777-8888";
		
		//obj.deposit(1000000); //상속 받은 메서드
		obj.deposit(10); //상속 받은 메서드
		
		try {
			int paidAmount = obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("지불액:" + paidAmount);
			System.out.println("잔액:" + obj.balance);
		} catch (Exception e) {	//e라는 매개변수를 통해 new Exception에 저장된 메시지를 호출함
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}
}
