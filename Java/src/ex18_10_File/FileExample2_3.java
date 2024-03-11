//File 클래스 디렉토리 생성
//실행 한 번 후 : 새로 만든 디렉토리 이름
//실행 두 번 후 : 이미 있는 디렉토리 이름
package ex18_10_File;
import java.io.*;
public class FileExample2_3 {
	public static void main(String[] args) {
		
		String dir = "D:/newDirectory/newFile.txt";
		
		File f3 = new File(dir);
		if(f3.exists()) {
			if(f3.delete()) {
				System.out.println(f3.getPath() + "삭제했습니다.");
			} else {
				System.out.println(f3.getPath() + "삭제 하지 못했습니다.");
			}
		} else { //D:/newDirectory 디렉토리가 있는 경우
			System.out.println(f3.getPath()+ "에 삭제하고자 하는 파일이 없습니다.");
		}
	}	
}
		

