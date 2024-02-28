//한꺼번에 여러 문자를 읽는 read 메소드 예
package ex18_01_FileReader;
import java.io.*;
public class FileReaderExample4_3_try_with_resource_test {
	public static void main(String[] args) {
		char[] arr = new char[64]; //파일에 있는 문자를 담을 char배열
		/*
		 * 1.try-with-resource문으로 try()괄호 안에 선언된 자원은
		 *   try문이 끝날 때 자동으로 close()를 호출한다.
		 * 
		 * 2.try-with-resource문에 의해 자동으로 객체의 close()가 호출될 수 잇으려면
		 *   클래스가 AutoCloseable 인터페이스를 구현한 것이어야 한다.
		 *   
		 *   형식)
		 *   try() {
		 *   	.....
		 *   } catch() {
		 *   
		 *   ) finally {
		 *   
		 *   }
		 */
		try (
			FileReader reader = new FileReader("src/ex18_01_FileReader/1.txt");
			) {
			while(true) {
				//Returns : The number of characters read
				int num = reader.read(arr);
				if (num==-1)	//더 이상 읽을 문자가 없을 경우 -1을 리턴한다.
					break;
				
				//arr의 0부터 num개 만큼 스트링으로 만든후 출력
				System.out.print(new String(arr,0,num));
				
			} //while end
		} //try end
		catch(FileNotFoundException fnfe) { // FilreReader() 생성자가 발생한 Exception 처리
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) { // read() 메소드가 발생한 예외 처리
			System.out.println("파일을 읽을 수 없습니다.");
		} finally { // 파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally 블록에서 사용.
			System.out.println("\n"+"final입니다.");
		}
	}
}