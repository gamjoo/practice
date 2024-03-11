package ex17_01_Thread;
public class MultithreadExample1 {
	public static void main(String[] args) {
		Thread thread = new DigitThread(); //쓰레드 생성
		//thread 실행
		thread.start();
	/*
	* -start() 설명 :
	* Causes this thread to begin execution;
	* the Java Virtual Machine calls the run method of this thread.
	* 
	* =>this thread(Thread thread = new DigitThread()의 thread)가 실행을 시작하도록 한다.
	*   JVM이 스레드의 run() 메소드를 호출한다.
	*   
	* -start()를 통해서 run()실행 한다.
	*  start method는 java.lang.Thread 클래스의 메소드다.
	*  새로 생성한 Thread를 start하면 Runnable 상태가 된다.
	* 
	* -thread.run(); 이렇게 호출하지 않는다.
	*/
	
	for (char ch = 'A'; ch<='Z'; ch++)
		System.out.print(ch);
	
	System.out.println("스레드 이름 : " + Thread.currentThread().getName());
	}

}
