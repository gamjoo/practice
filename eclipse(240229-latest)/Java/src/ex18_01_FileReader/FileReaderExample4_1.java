package ex18_01_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample4_1 {
	public static void main(String[] args) {
		FileReader reader = null;
		char[] arr = new char[64]; //파일에 있는 문자를 담을 char배열
		try {
			reader = new FileReader("거위의 꿈.txt");
			
			while(true) {
				//Returns : The number of characters read
				//arr의 배열 크기 만큼 문자를 읽어 arr에 저장한 후 읽은 개수를 반환한다.
				int num = reader.read(arr);
				if (num==-1)	//더 이상 읽을 문자가 없을 경우 -1을 리턴한다.
					break;
				
				for (int cnt=0; cnt<num; cnt++) {
					System.out.printf("%c", arr[cnt]);
				} //for end
			} //while end
		} catch(FileNotFoundException fnfe) { // FilreReader() 생성자가 발생한 Exception 처리
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) { // read() 메소드가 발생한 예외 처리
			System.out.println("파일을 읽을 수 없습니다.");
		} finally { // 파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally 블록에서 사용.
			try {
				if (reader != null)
					reader.close(); // 파일을 닫는 명령문
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}
	}
}