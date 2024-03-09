//Rectangle 객체를 역직렬화하는 프로그램
package ex19_07_serialversionUID;
import java.io.*;
public class ObjectInputExample3 {
	public static void main(String[] args) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output10.dat"));

			Rectangle obj = (Rectangle) in.readObject();
			System.out.println("***역직렬화 한다.***");
			System.out.println(obj);
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (EOFException eofe)	{
			System.out.println("끝");
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
			System.out.println("파일을 읽을 수 없습니다.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		} finally {
			try {
				if(in != null)
					in.close(); //3. 닫기
			} catch (IOException e) {
				System.out.println("파일 닫는 중 오류입니다.");
			}
		}
	}
}