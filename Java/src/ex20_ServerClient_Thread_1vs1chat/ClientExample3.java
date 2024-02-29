//클라이언트 프로그램
package ex20_ServerClient_Thread_1vs1chat;
import java.net.*;
public class ClientExample3 {
	public static void main(String[] args) {
		System.out.println("여기는 클라이언트 입니다.~");
		Socket socket = null;
		try {
			socket = new Socket("192.168.0.42", 9001);
			//두 개의 스레드를 생성한다
			Thread thread2 = new ReceiverThread(socket);
			Thread thread1 = new SenderThread(socket);
			
			thread1.start();
			thread2.start();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// socket 닫으면 안 됨
	}
}
