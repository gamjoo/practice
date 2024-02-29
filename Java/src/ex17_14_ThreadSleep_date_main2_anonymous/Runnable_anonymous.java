package ex17_14_ThreadSleep_date_main2_anonymous;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runnable_anonymous {
	public static void main(String[] args) {
		Thread th = new Thread(new Runnable(){
			
			static boolean autoprint = true;
			public void run() {
				while (true) {
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
				Date d = new Date();
				SimpleDateFormat today = new SimpleDateFormat("yyyy년MM월dd일 E요일 HH시 mm분 ss초");
				System.out.println(today.format(d));
			}	
		});
			
			th.start();
	}
}