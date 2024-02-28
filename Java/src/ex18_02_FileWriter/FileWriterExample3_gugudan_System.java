package ex18_02_FileWriter;

import java.io.*;

public class FileWriterExample3_gugudan_System {
	public static void main(String[] args) {
		
		FileWriter writer = null;
		try {
			writer = new FileWriter("D:/workspace/Java/src/ex18_02_FileWriter/gugudan.txt");
		
					for (int dan=2; dan<10; dan++) {
						writer.write("[" + dan + "단]" + "\t");
					}

					for (int i=1; i<10; i++) {
						writer.write("\n");
						for (int j=2; j<10; j++) {
							writer.write(j + "*" + i + "=" + (j*i) + "\t");
							}
					}		
		} catch (IOException ioe) {
			System.out.print("파일로 출력할 수 없습니다.");
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

