package ex08_09_abstract_method;

class EMailSender extends MessageSender {
	
	String senderAddr;
	String emailBody;

	EMailSender(String title, String senderName,
			String senderAddr, String emailBody) {
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}
	
	// 슈퍼 클래스의 메서드를 오버라이드하는 메서드
	// 추상 클래스를 상속받은 class는
	// 추상 메서드를 구현(implement)해야만 한다!!! (override)
	
	void sendMessage(String recipient) {
		  System.out.println("------------------------------");
		  System.out.println("제목: " + title);
		  System.out.println("보내는 사람: " + senderName + "\n" 
			                 + "보낸 주소 : " + senderAddr);
		  System.out.println("받는 사람: " + recipient);
		  System.out.println("내용: " + emailBody);
	}

}