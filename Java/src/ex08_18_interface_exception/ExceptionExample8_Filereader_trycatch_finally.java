//상속 관계에 있는 두 종류의 Exception을 처리하는 try문
//ExceptionExample9_1의 catch문 변경 예 - 에러 발생
//catch문 예외 순서가 부모가 자식보다 먼저와서 에러 발생
//FileNotFoundException -> IOException
//부모 먼저 예외를 정의하면 자식에서 예외를 정의할 필요가 없어짐 (다형성)

package ex08_18_interface_exception;

import java.io.FileReader;
import java.io.IOException;

class ExceptionExample8_Filereader_trycatch_finally {
	

	public static void main(String[] args) {
		FileReader reader = null; // (finally) 쓰려면 main에 정의해줘야 함
		
		try {
			reader = new FileReader("some.txt");
		} 
		
		catch (Exception e) {
			System.out.println("파일을 찾을 수 없습니다.2");
		} finally { 		//IOException을 try, catch문으로 한번 더 처리해야 함
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//throws FileNotFoundException 오류를 던져 줄테니, 개발자가 알아서 처리해라
		//try-catch문은 하위클래스에서 상위클래스로 작성한다.
		//상위 클래스로 정의하면 굳이 하위 클래스로 작성할 이유가 없기 때문이다(다형성).
		/* catch (FileNotFoundException e) {
		   System.out.println("파일을 찾을 수 없습니다.") }
		   catch (IOException e) {
		   System.out.println("입출력 오류") } 
		 */
	}
	
}