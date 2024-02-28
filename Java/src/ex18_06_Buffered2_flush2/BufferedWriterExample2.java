package ex18_06_Buffered2_flush2;
import java.io.*;
public class BufferedWriterExample2 {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("output.txt");
			bw = new BufferedWriter(fw,5);
			char arr[] = {'내','꺼','인','1','듯',
						  '2','내','꺼','3','아',
						  '닌','4','내','꺼','5',
						  '같','은','6','너'
						  };
			for (int cnt=0; cnt<arr.length; cnt++)
			bw.write(arr[cnt]);
		
			 //버퍼에 있는 데이터를 파일에 즉시 출력하도록 하는 메소드
			bw.flush();
		} catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				if (fw != null)
					fw.close();	//아직 버퍼에 데이터가 남아 있는데 출력 스트림을 닫는다.
					//같, 은, 6, 너 4개는 출력되지 않았다.
		} catch (IOException e) {
			System.out.println("파일을 닫는 중 오류입니다.");
		}
		}
	}
}
