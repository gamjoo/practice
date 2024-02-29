package ex17_03_Thread_four;
public class AlphabetThread extends Thread {
	public void run() {
		for (char ch = 'A'; ch<='Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);
		//sleep 메소드 : 일정 시간이 경과되기를 기다리는 메소드.
		//public static void sleep(long millis) throws InterruptedException
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}

		}
	}
}
