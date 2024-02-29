package ex18_04_Buffered;
import java.io.*;

public class BufferedWriterExample1_write {
	public static void main(String[] args) {
		String message = "하하입니다. \n오늘도 화이팅입니다.";
		
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("src/ex18_04_Buffered/output2.dat"));
			writer.write(message);
		} catch (IOException ioe) { //Exception - IOException
			System.out.println("파일을 읽을 수 없습니다.");
		} finally { //파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블록에서 사용.
			try {
				if(writer != null)
					writer.close();
			} catch (IOException e) { //close() 발생하는 예외 처리
				System.out.println("닫는 중 오류입니다.");
			}
		}
	}
}