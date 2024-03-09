package ex17_15_Runnable_Interface_anonymous_ramda;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runnable_anonymous_Ramda {
	public static void main(String[] args) {
		Thread th = new Thread(() -> {
			
			SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일 E요일 HH시 mm분 ss초");
			for(;;) {
				Date d = new Date(); //오늘 시스템 날짜와 시간
				System.out.println(s.format(d));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
					System.out.println(ie.toString());
				}
		}
			
	});
		
			th.start();
			
	}
}