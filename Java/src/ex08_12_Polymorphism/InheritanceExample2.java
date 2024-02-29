package ex08_12_Polymorphism;

class InheritanceExample2 {
	public static void main(String[] args) {
		
		Account obj1 = new Account("111-22-333333", "임꺽정", 10000);
		printAccountInfo(obj1);

		
		CheckingAccount obj2 = new CheckingAccount("444-55-666666","홍길동",20000,"5555-6666-7777");
		printAccountInfo(obj2);

		
		CreditLineAccount obj3 = new CreditLineAccount("777-88-999999","김선달",30000,2000000);
		printAccountInfo(obj3);

		// 다양한 타입의 객체를 가지고 있는 메소드를 호출한다.
		BonusPointAccount obj4 = new BonusPointAccount("000-00-000000", "김미영",0,0);
		printAccountInfo(obj4);

		
	}
	
	//static을 안 붙이면, printAccountInfo가 포함된
	//클래스를 인스턴스화 한 후에야 이 메소드를 사용할 수 있게 됨
	//다양한 타입의 객체를 부모 클래스 한 타입의 파라미터로 받을 수 있다. (부모는 자식을 다 감싼다)
	static void printAccountInfo (Account obj) {
		System.out.println("계좌번호:"+obj.accountNo);
		System.out.println("예금주 이름:"+obj.ownerName);
		System.out.println("잔액:"+obj.balance);
		System.out.println();
	}

}
