package ex08_13_01_Polymorphism;

class SMSSender extends MessageSender {
	
	String returnPhoneNo;
	String message;

	SMSSender(String title, String senderName,
			String returnPhoneNo,String message) {
		super(title, senderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}
	
	// 슈퍼 클래스의 메서드를 오버라이드하는 메서드
	// 추상 클래스를 상속받은 class는
	// 추상 메서드를 구현(implement)해야만 한다!!! (override)
	
	void sendMessage(String recipient) {
	    System.out.println("------------------------------");
	    System.out.println("제목: " + title);
	    System.out.println("보내는 사람: " + senderName);
	    System.out.println("전화번호: " + recipient);
	    System.out.println("회신 전화번호: " + returnPhoneNo);
	    System.out.println("메시지 내용: " + message);
	}

}