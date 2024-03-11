//생성자가 추가된 직불 계좌 클래스
package ex09_07_instanceof;

public class CheckingAccount extends Account {
	String cardNo;
	CheckingAccount(String accountNo, String ownerName,
					int balance, 	  String cardNo) {
		
		//파라미터 3개의 슈퍼 클래스 생성자 호출문
		//반드시 생성자의 첫번째 명령문이어야 한다.
		//예전에 this()로 생성자 호출했던 것도 연결해서 공부
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;		//클래스 안에 선언된 필드 초기화
	}

	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다.");

		return super.withdraw(amount); //super.은 생략할 수 있다.
	}

}
