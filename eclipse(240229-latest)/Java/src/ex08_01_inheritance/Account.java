package ex08_01_inheritance;
//모든 클래스의 조상은 Object 클래스이다.
//다른 클래스로부터 상속 받지 않는 모든 클래스들은 자동으로 Object 클래스로부터 상속 받는다.

class Account { //컴파일러가 extends object를 추가한다.
				//class Account의 부모는 object

	String accountNo; //계좌번호
	String ownerName; //예금주 이름
	int balance;	  //잔액

	void deposit(int amount) {	//예금한다.
		this.balance += amount;
	}

	int withdraw(int amount) throws Exception {	//인출한다.
		// Exception 클래스를 이용해서 예외를 발생시킨다.
		if (balance < amount)
			throw new Exception("잔액이 부족합니다.");
		// if문 안에 문장이 하나만 있으면 생략 가능
		balance -= amount;
		return amount;
	}

}
