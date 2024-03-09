package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Today {
	//필드
	private Calendar c1 = new GregorianCalendar();

	//생성자
	public Today(GregorianCalendar c1) {
		this.c1 = c1;
	}

	public Today() {

	};

	public String toString() {
		String[] yo = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		String[] ampm = { "오전", "오후" };

		int y = c1.get(Calendar.YEAR);
		int m = c1.get(Calendar.MONTH) + 1;
		int d = c1.get(Calendar.DATE);
		int h1 = c1.get(Calendar.HOUR);
		int ap = c1.get(Calendar.AM_PM);  //0:오전, 1:오후
		int mm = c1.get(Calendar.MINUTE);
		int s = c1.get(Calendar.SECOND);
		int yoil = c1.get(Calendar.DAY_OF_WEEK);  //1:일요일

		return y + "년 " + m + "월 " + d + "일 " + " " + ampm[ap] + " " + h1 + ":" + mm + ":" + s + " " + yo[yoil - 1]
				+ "입니다.";

	}

}
