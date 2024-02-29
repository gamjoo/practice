//알파벳만 출력하는 프로그램
package ex17_02_Thread_sleep;
public class MultithreadExample {
	public static void main(String[] args) {
		for (char ch = 'A'; ch<='Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);	//sleep 메소드 : 일정 시간이 경과되기를 기다리는 메소드.
		//public static void sleep(long millis) throws InterruptedException
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}//catch end
		}//for end
	}//main endThreadExample2.java
}//class end
