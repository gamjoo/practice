//생성자가 추가된 직불 계좌 클래스
package ex08_03_super_constructor;
public class CheckingAccount_error extends Account {
	String cardNo;
	
	//생성자의 첫 줄에서 조상 클래스의 생성자를 호출하는데 자손 클래스의 멤버가
	//부모 클래스의 멤버를 사용할 수도 있으므로, 부모의 멤버들이 먼저 초기화되어 있어야 한다.
	CheckingAccount_error(String accountNo, String ownerName,
					int balance, 	  String cardNo) {
		super();
		this.accountNo = accountNo; //상속 받은 필드 초기화
		this.ownerName = ownerName; //상속 받은 필드 초기화
		this.balance = balance;		//상속 받은 필드 초기화
		this.cardNo = cardNo;		//클래스 안에 선언된 필드 초기화
	}

	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다.");

		return withdraw(amount);
	}

}
