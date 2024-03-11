package ex19_04_Serializable_interface;
import java.io.*;
public class ObjectInputExample3 {
	public static void main(String[] args) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output3.dat"));
			while(true) {
				//2. 파일 읽기 - 객체를 역직렬화하는 부분이다.
				//readObject() : 입력된 스트림으로부터 객체를 만들어서 리턴하는 메소드. 리턴타입 Object
				//리턴 타입 Object를 원래의 클래스 타입으로 사용하기 위해 캐스트 연산을 해야 한다.
				//readObject()가 Object형이므로 GregorianCalendar 타입으로 형 변환 한다.
				BBSItem obj = (BBSItem) in.readObject();
				System.out.println(obj.toString());
				System.out.println(obj);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (EOFException eofe)	{
			System.out.println("끝");
		} catch (IOException ioe) {
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