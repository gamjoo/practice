package ex18_02_FileWriter;
import java.io.*;
public class FileWriterExample2_String {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			//true : append(원래 있던 파일 내용 뒤에 추가로 쓴다.)
			//false : overwrite(덮어 쓰기 한다.)
			writer = new FileWriter("output.txt", true);
			//public FileWriter(String fileName) throws IOException
			//FileWriter 생성자는 IOException에러를 발생하기 때문에
			//IOException 처리문이 있어야 한다.
			
			String message = "감기 조심하세요~";
			writer.write(message);
			
			writer.write("\n"); //줄을 바꾸는 문자 추가
			
		} catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				System.out.println("파일을 닫는 중 오류입니다.");
			}
		}
		
	}

}
