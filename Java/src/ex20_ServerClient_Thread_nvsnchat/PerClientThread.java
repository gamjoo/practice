//각 클라이언트 접속에 대해 하나씩 작동하는 스레드 클래스
package ex20_ServerClient_Thread_nvsnchat;
import java.io.*;
import java.util.*;
import java.net.*;
public class PerClientThread extends Thread {
//ArrayList객체를 여러 스레드가 동시에 사용하게 되면 문제가 발생할 수 있어 안전하게 공유할 수 있는 동기화 리스트로 만든다.
//동기화된 리스트로 만들기 위해 java.util.Collections 클래스의 synchronizedList메소드를 이용한다.
	private static List<PrintWriter> list =
			Collections.synchronizedList(new ArrayList<PrintWriter>());
	Socket socket;
	PrintWriter writer;
	
	PerClientThread(Socket socket) {
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);	//리스트에 소켓의 출력스트림을 등록한다.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void run() {
		String name = null;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			/*SenderThread.java에서
			  writer.println(name);
			  writer.flush();
			  로 보낸 name을 아래의 문장에서 읽어온다.
			 */
			//수신된 첫번째 문자열을 대화명으로 사용하기 위해 저장한다.
			name = reader.readLine();
			sendAll("#" + name + "님이 들어오셨습니다");
			
			while (!socket.isClosed()) {
				String str = reader.readLine();
				
				//소켓의 연결이 끊어지면 null을 리턴한다.
				if (str == null)
					break;
				
			//수신된 메시지 앞에 대화명을 붙여서 모든 클라이언트로 송신한다.
				sendAll(name + ">" +str);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//사용자가 채팅을 종료하면 list에서 삭제해줘야 한다.
			list.remove(writer);
			
			//사용자가 채팅을 종료했다는 메시지를 모든 클라이언트로 보낸다.
			sendAll("#" + name +"님이 나가셨습니다");
			
			try {
				reader.close();
			} catch (Exception ignored) {
				System.out.println("소켓 닫는 중에 에러 발생했습니다.");
			}
		}
	}
	
	 synchronized private void sendAll(String str) {
		 for (PrintWriter writer : list) {
			 writer.println(str);	
			 writer.flush();
		 }
		 System.out.println(str);	//추가한 부분 - 서버 화면에 출력되도록 한다.
	 }	
}