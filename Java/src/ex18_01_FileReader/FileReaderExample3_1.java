package ex18_01_FileReader;
import java.io.*;
public class FileReaderExample3_1 {
	public static void main(String[] args) {
		//1. 파일을 연다.
		/* 생성자 인자값으로 파일의 위치를 지정한다.
		 * 지정방법 : 상대경로와 절대경로 지정
		 *  1)상대경로 : 프로젝트 경로를 기준으로 차례대로 파일의 위치를 지정한다.
		 *  2)절대경로 : 드라이브며우터 차례대로 파일의 위치를 지정한다.
		 *  		예) D:/작업폴더/프로젝트/poem.txt
		 */
			
		FileReader reader = null;
		
		try {
			reader = new FileReader("poem.txt");
			//FileReader reader = new FileReader("D:...");
			while (true) {
				//read() : 파일에 있는 문자 하나를 읽어서 리턴하는 메소드
				int data = reader.read();
				if (data==-1)	//더 이상 읽을 데이터가 없는 경우
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
		} catch (FileNotFoundException fnfe) { //FilreReader() 생성자가 발생한 Exception 처리
				System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) { //read() 메소드가 발생한 예외 처리
			System.out.println("파일을 읽을 수 없습니다.");
		} finally { //파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally 블록에서 사용.
			try {
				if (reader != null)
					reader.close(); //파일을 닫는 명령문
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}
	}
}
