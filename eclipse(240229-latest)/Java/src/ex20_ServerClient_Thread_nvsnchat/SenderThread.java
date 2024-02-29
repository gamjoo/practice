//메시지를 송신하는 스레드 클래스
package ex20_ServerClient_Thread_nvsnchat;
import java.io.*;
import java.net.*;
public class SenderThread extends Thread {
	private Socket socket;
	private String name; //추가
	
	SenderThread(Socket socket, String name) { //수정
		this.socket = socket;
		this.name = name; //추가
	}
	
	public void run() {
		PrintWriter writer = null;
		BufferedReader reader = null;	
		
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			//키보드를 통해 입력한 것을 읽는다. 소켓을 통해 들어온 걸 읽는 게 아니라
			writer = new PrintWriter(socket.getOutputStream());
			//출력 내보낼 때 바이트로 쪼개는 작업을 쉽게 하기 위해 PrintWriter
			
			//추가
			//제일 먼저 서버로 대화명을 송신한다.
			writer.println(name);
			writer.flush();
			
			//키보드로 입력된 메시지를 서버로 송신한다.
			while (!socket.isClosed()) {
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
