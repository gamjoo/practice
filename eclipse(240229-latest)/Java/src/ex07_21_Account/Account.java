package ex07_21_Account;

public class Account {

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

	int withdraw(int amount) throws Exception {
		// Exception 클래스를 이용해서 예외를 발생시킨다.
		if (balance < amount) {
			throw new Exception("잔액이 부족합니다.");

		}
		balance -= amount;
		return amount;
	}

}
