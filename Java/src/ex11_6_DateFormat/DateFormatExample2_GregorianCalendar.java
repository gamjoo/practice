//SimpleDateFormat 클래스를 사용하여 날짜와 시간을 포맷하는 프로그램
//SimpleDateFormat 클래스의 format()메소드의 매개변수로 Date형 필요
//Calendar의 getTime()메소드를 이용해서 Date형 리턴값 얻음
//Calendar -> Date형
package ex11_6_DateFormat;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DateFormatExample2_GregorianCalendar {
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
	
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 a HH시 mm분 ss초 E요일");
		System.out.println(sdf1.format(calendar.getTime()));
	}

}
