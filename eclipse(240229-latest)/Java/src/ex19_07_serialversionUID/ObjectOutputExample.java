//Rectangle 객체를 직렬화하는 프로그램
package ex19_07_serialversionUID;
import java.io.*;
public class ObjectOutputExample {
	public static void main(String[] args) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output10.dat"));
			Rectangle obj = new Rectangle(100,200);
			System.out.println(obj);
			out.writeObject(obj); //객체를 직렬화 하는 부분
		}
		catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		}
		finally {
			try {
				if(out != null)
					out.close();
			}
			catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
