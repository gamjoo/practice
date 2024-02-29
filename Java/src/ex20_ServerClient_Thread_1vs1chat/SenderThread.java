//메시지를 송신하는 스레드 클래스
package ex20_ServerClient_Thread_1vs1chat;
import java.io.*;
import java.net.*;
public class SenderThread extends Thread {
	private Socket socket;
	
	SenderThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		PrintWriter writer = null;
		BufferedReader reader = null;	
		
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			//키보드를 통해 입력한 것을 읽는다. 소켓을 통해 들어온 걸 읽는 게 아니라
			writer = new PrintWriter(socket.getOutputStream());
			//출력 내보낼 때 바이트로 쪼개는 작업을 쉽게 하기 위해 PrintWriter
			
			while (!socket.isClosed()) {
				//키보드로부터 문자열을 입력받는다.
				String str = reader.readLine();
						
				if (str.equals("bye"))
					break;
				
				writer.println(str);  //BufferedReader를 통해 한 줄씩 입력한 걸 한 줄씩 출력
				writer.flush();		//Buffer가 가득차지 않아도 출력
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
