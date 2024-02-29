//네 개의 스레드로 실행되는 멀티스레드 프로그램
//main, thread1, thread2, thread3
package ex17_03_Thread_four;
public class MultithreadExample {
	public static void main(String[] args) {
		// 세 개의 스레드르 생성해서 시작한다.

		Thread thread1 = new DigitThread();
		Thread thread2 = new DigitThread();
		Thread thread3 = new AlphabetThread();
		
		thread1.start();
		thread2.start();
		thread3.start();

	}
}

