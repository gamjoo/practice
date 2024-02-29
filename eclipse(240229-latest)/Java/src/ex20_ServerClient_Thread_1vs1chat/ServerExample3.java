//서버 프로그램
//실행 순서 : 서버 프로그램 실행 -> 클라이어느 프로그램 실행
package ex20_ServerClient_Thread_1vs1chat;
import java.net.*;
public class ServerExample3 {
	public static void main(String[] args) {
		System.out.println("여기는 서버 입니다.~");
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9000);
			socket = serverSocket.accept();
			System.out.println("========== 접속 정보 ==========");
			System.out.println(socket.getInetAddress().getHostAddress()+"에서 접속했습니다.");
			//getInetAddress() : InetAddress 객체를 반환한다.
			System.out.println("============================");
			// 두 스레드를 생성한다.
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			
			//두 스레드를 시작한다.
			thread1.start();
			thread2.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			/* SenderThread, ReceiverThread에서 사용하는 socket을 닫아주면 안된다.(연결끊김)
			 try {
			 	 socket.close();
			 } catch (Exception ignored) {
			 	 System.out.println("소켓 닫는 중 오류");
			 }
			 */
		} try {
			serverSocket.close();
			//1:1 대화상황이어서 serverSocket 닫아줌
		}
		catch (Exception ignored) {
			System.out.println("서버 소켓 닫는 중 에러 발생했습니다.");
		}
	}
}
