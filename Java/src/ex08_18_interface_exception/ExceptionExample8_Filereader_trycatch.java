package ex08_18_interface_exception;

import java.io.FileReader;

class ExceptionExample8_Filereader_trycatch {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		//close 메소드에서도 IOException을 던지고 있으니,
		//이것에 대한 예외처리를 해줘야 한다
		} catch (Exception e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
		//throws FileNotFoundException 오류를 던져 줄테니, 개발자가 알아서 처리해라
		//try-catch문은 하위클래스에서 상위클래스로 작성한다.
		//상위 클래스로 정의하면 굳이 하위 클래스로 작성할 이유가 없기 때문이다.
		/* catch (FileNotFoundException e) {
		   System.out.println("파일을 찾을 수 없습니다.") }
		   catch (IOException e) {
		   System.out.println("입출력 오류") } 
		 */
	}
	
}