//은행 계좌 클래스
package ex08_06_final_class;

class Account {

	String accountNo; 
	String ownerName; 
	int balance;
	
	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	void deposit(int amount) {
		this.balance += amount;
	}

	final int withdraw(int amount) throws Exception {
		if (balance < amount)
			throw new Exception("잔액이 부족합니다.");
		balance -= amount;
		return amount;
	}

}
