package ex18_03_FileInPutStream_FileOutptuStream;
import java.io.*;
public class KoalaCopy {
	public static void main(String[] args) {
		
		String originalFileName = "D:/temp/koala.jpg";
		String targetFileName = "D:/temp2/koala_copy.jpg";
		try ( FileInputStream fis = new FileInputStream(originalFileName);
			  FileOutputStream fos = new FileOutputStream(targetFileName);
		    )
		{
			byte[] readBytes = new byte[1024];
			while (fis.read(readBytes) != -1) {
				//write(byte[] b)
				//받아오는 데이터를 
				fos.write(readBytes); //1024바이트를 출력스트림으로 보낸다.
			}
			
			System.out.println("복사가 잘 되었다.");
	
	
		
		} catch(FileNotFoundException fnfe) { // FilreReader() 생성자가 발생한 Exception 처리
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) { // read() 메소드가 발생한 예외 처리
			System.out.println("파일을 읽을 수 없습니다.");
		} finally { // 파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally 블록에서 사용.
				System.out.println("IOException");
		}
	}
}