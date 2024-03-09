//상속 받은 withdraw메소드가 final 메소드라 오버라이딩 불가

package ex08_06_final_class;

public class CreditLineAccount extends Account {
	int creditLine;	//마이너스 한도 필드

	CreditLineAccount(String accountNo,
					  String ownerName,
					  int balance,
					  int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	int withdraw(int amount) throws Exception {
		if ((balance + creditLine) < amount)
			throw new Exception("인출이 불가능합니다.");
		balance -= amount;
		return amount;
	}

}
