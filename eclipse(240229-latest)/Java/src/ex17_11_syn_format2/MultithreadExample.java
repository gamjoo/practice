//critical section의 동기화
/*
 * 멀티스레드 프로그램에서 스레드들이 번갈아 실행되는 스케쥴은
 * JVM에 의해 임의로 정해지는데 이로 인해 적절치 못한 순간에 다른 스레드로 제어가 넘어가
 * 예기치 못한 문제가 발생할 수 있다.
 * 
 * 이런 문제는 주로 공유 데이터를 사용하는 부분에서 일어나는데 이런 부분을 critical section(임계 영역)이라고 한다.
 * 즉, 멀티 스레드 프로그램에서 단 하나의 스레드만 실행할 수 있는 코드 영역을 임계 영역이라고 한다.
 * 이 무제를 일으키지 않도록 하려면 그 부분이 실행되는 동안
 * 다른 스레드가 공유 데이터를 사용할 수 없도록 만들어야 하는데
 * 그렇게 하는 것을 critical section의 동기화라고 한다.
 * 
 * [임계 영역 동기화 방법]
 * 	1. 동기화 블럭 : 일부분만 임계 영역으로 만들 경우
 * 		메서드 선언 {
 * 				synchronized (동기화할 객체) {
 * 							임계 영역 코딩 //단 하나의 스레드만 실행된다.
 * 				}
 * 	2. 동기화 메소드 : 메소드 전체 내용을 임계 영역으로 만들 경우
 * 		synchronized 메소드 선언 {
 */
package ex17_11_syn_format2;

public class MultithreadExample {
	public static void main(String[] args) {
		Account a1 = new Account("111-111-1111", "회사", 20000000);
		Account a2 = new Account("222-222-2222", "직원", 10000000);
		
		SharedArea area = new SharedArea(a1, a2);
		TransferThread thread1 = new TransferThread(area);
		PrintThread thread2 = new PrintThread(area);
		thread1.start();
		thread2.start();
	}

}
