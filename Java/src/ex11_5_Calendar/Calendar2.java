package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar2 {
	public static void main(String[] args) {
		
	Calendar today = Calendar.getInstance();	
	
	System.out.print(today.get(1)+"년 ");
	System.out.print(today.get(Calendar.MONTH)+1+"월 ");
	System.out.print(today.get(Calendar.DATE)+"일  ");
	if (today.get(Calendar.AM_PM)==1)
		System.out.print("오후");
		else
			System.out.print("오전");
	System.out.print(today.get(Calendar.HOUR)+":");
	System.out.print(today.get(Calendar.MINUTE)+":");
	System.out.print(today.get(Calendar.SECOND)+" ");

	String value = switch (today.get(Calendar.DAY_OF_WEEK)) {
	case 1 -> "일요일";
	case 2 -> "월요일";
	case 3 -> "화요일";
	case 4 -> "수요일";
	case 5 -> "목요일";
	case 6 -> "금요일";
	case 7 -> "토요일";
	default -> null;
	};
	
	if (today.get(Calendar.DAY_OF_WEEK)==5)
		System.out.print(value);
	}

	
// 특정 날짜에 대한 정보를 얻고자 할 때 생성자에 년, 월, 일을 인자로 넘긴다.
 Calendar c1 = new GregorianCalendar(2024,0,1); //2024년 1월 1일
}
