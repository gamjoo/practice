package ex17_08_syn_problem;

public class Account {
	private String accountNo; //계좌번호
	private String ownerName; //예금주 이름
	private int balance; //잔액
	
	//클래스 안에서 마우스 우클릭 -> Source -> Generate Getter and Setters로 만들 수 있다.
	
	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount) {
		if(balance < amount)
			return 0;
		balance -= amount;
		return amount;
	}
}
