//추상 메서드를 포함하는 클래스 - 메시지 전송 클래스

package ex08_09_abstract_method;

public abstract class MessageSender { //클래스 자체도 추상 클래스로
	String title;		//제목
	String senderName;  //발송자 이름

	MessageSender (String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}
	
	//추상 메서드 - 메시지를 송신한다
	abstract void sendMessage(String recipient);

}