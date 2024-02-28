package ex08_18_interface_exception;

import java.io.*;

class ExceptionExample8_Filereader {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader = new FileReader("some.txt");
		//throws FileNotFoundException 오류를 던져 줄테니, 개발자가 알아서 처리해라

	}
}