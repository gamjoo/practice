package Homework_240130;
import java.util.*;
import java.text.SimpleDateFormat;

public class Threadautoprint_Runnable implements Runnable {
	@Override
	public void run() {
		SimpleDateFormat today = new SimpleDateFormat("yyyy년MM월dd일 E요일 HH시 mm분 ss초");
		for(;;) {
			Date d = new Date();

		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (autoprint)
				autoprint();
		}
	}
	
	public void autoprint() {
		System.out.println(today.format(d));
	}
}
