//File 클래스 디렉토리 생성
//실행 한 번 후 : 새로 만든 디렉토리 이름
//실행 두 번 후 : 이미 있는 디렉토리 이름
package ex18_10_File;
import java.io.*;
public class FileExample2_4 {
	public static void main(String[] args) {
		
		//directory 삭제
		/*
		 * boolean java.io.File.delete()
		 * directory 안에 파일이 있으면 삭제하지 못한다.
		 * 이 때 반환값은 false
		 */
		
		File f4 = new File("D:/newDirectory");
		if(f4.exists()) {
			if(f4.delete()) {
				System.out.println(f4.getPath() + " 삭제했습니다.");
			} else {
				System.out.println(f4.getPath() + " 삭제 하지 못했습니다.");
			}
		} else { //D:/newDirectory 디렉토리가 있는 경우
			System.out.println(f4.getPath()+ "에 삭제하고자 하는 directory 없습니다.");
		}
	}	
}
		

