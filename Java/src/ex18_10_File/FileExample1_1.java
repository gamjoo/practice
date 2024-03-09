package ex18_10_File;
import java.io.File;
import java.util.GregorianCalendar;
public class FileExample1_1 {
	public static void main(String[] args) {
		//파일 관리에 사용되는 File 클래스
		//현재 디텍토리 경로명을 가지고 File 객체를 생성한다.
		File file = new File("."); //현재 디렉토리(.), 상위 디렉토리(..)
		
		File[] arr = file.listFiles();//서브 디렉토리와 파일 목록을 가져온다.
		
		for (int cnt=0; cnt<arr.length; cnt++) {
			String name = arr[cnt].getName(); //이름을 리턴
			
			if (arr[cnt].isFile()) //파일이면 true 아니면 false
				//arr[cnt].length():파일의 크기(바이트)
				System.out.printf("%-25s %7d \t", name, arr[cnt].length());
			else 
				System.out.printf("%-25s,   <DIR>  \t", name);
			
			//1970년 1월 1일 0시 0분 0초 기점으로 경과한 밀리세컨드 값 리턴
			//사람이 이해할 수 있는 날짜와 시간으로 변경할 필요가 있다.
			long time = arr[cnt].lastModified();//최종 수정일시 리턴
			//System.out.printf("%d\n", time);
			
			
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTimeInMillis(time); //calendar에 입력되는 시간을 밀리세컨드 단위 데이터를 입력해 설정한다.
			//1$ : 포맷 문자열 다음에 오는 첫 번째 파라미터를 의미한다. (calendar)
			//%1$tF : yyyy-MM-dd 포맷의 날짜
			//%1$tT : HH:mm:ss 포맷
			//System.out.printf("%1$tT %1$tF \n", calendar);
			System.out.printf("%tF %tT \n", calendar, calendar);
		}
	}
}