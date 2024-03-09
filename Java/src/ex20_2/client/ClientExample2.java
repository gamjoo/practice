//클라이언트 프로그램
package ex20_2.client;
import java.io.*;
import java.net.*;

public class ClientExample2 {
	public static void main(String[] args) {
		System.out.println("여기는 클라이언트 입니다.~");
		Socket socket = null;
		try {
//127.0.0.1은 예약된 IP주소로 localhost 또는 루프백(loopback) 주소 라고 하며 자신의 컴퓨터를 의미한다.
			socket = new Socket("127.0.0.1",9001);
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			//데이터를 송신한다.
	//println 메소드 호출 즉시 네트워크로 송신되는 것이 아니라 버퍼가 다 찰때까지 모아졌다가 한꺼번에 송신된다.
	//그렇기 때문에 println 메소드를 호출한 다음 바로 문자열이 송신되도록 하려면 flush 메소드를 호출해야 한다.
			writer.println("Hello, Server2");
			writer.flush();
			
			//데이터를 수신한다.
			String str = reader.readLine();
			//수신된 데이터를 출력한다.
			System.out.println(str);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
				try {
					socket.close(); // 소켓을 닫습니다.
				} catch (Exception ignored) {
					System.out.println("소켓 닫는 중 에러입니다.");
				}
		}
	}
}


	
