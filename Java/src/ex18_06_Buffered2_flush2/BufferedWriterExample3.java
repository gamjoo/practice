package ex18_06_Buffered2_flush2;
import java.io.*;
public class BufferedWriterExample3 {
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
			
			/*
			 * 버퍼가 다 차기 전까지는 파일에 실제로 데이터를 쓰지 않는다.
			 */
			 
		} catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				if (fw != null)
					bw.close();
				//보조 기반 스트림이 정상적으로 닫힐 때
				//자동으로 flush()메소드를 호출한다.
		} catch (IOException e) {
			System.out.println("파일을 닫는 중 오류입니다.");
		}
		}
	}
}
