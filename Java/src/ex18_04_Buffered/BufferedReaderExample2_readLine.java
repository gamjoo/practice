package ex18_04_Buffered;
import java.io.*;

public class BufferedReaderExample2_readLine {
	public static void main(String[] args) {
		
		BufferedReader reader = null;
		String message = null;
		try {
			reader = new BufferedReader(new FileReader("src/ex18_04_Buffered/output2.dat"));
			
			//더 이상 읽을 데이터가 없는 경우 null을 리턴한다.
			while ((message = reader.readLine())!= null) {
				System.out.println(message);
			}
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally { //파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블록에서 사용.
			try {
				if(reader != null)
					reader.close();
			} catch (IOException e) { //close() 발생하는 예외 처리
				System.out.println("닫는 중 오류입니다.");
			}
		}
	}
}