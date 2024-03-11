package Homework_240130;
public class Threadautoprint_Runnabe_Make {
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Threadautoprint_Runnable());
		thread.start();
	}
}
