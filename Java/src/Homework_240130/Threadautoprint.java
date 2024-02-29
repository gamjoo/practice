package Homework_240130;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Threadautoprint extends Thread {
	public void run() {
		boolean start = true;
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (start)
				autoprint();
		}
	}

	public void autoprint() {
		Date d = new Date();
		SimpleDateFormat today = new SimpleDateFormat("yyyy년MM월dd일 E요일 HH시 mm분 ss초");
		System.out.println(today.format(d));
	}
}
