/*	스레드는 일반 스레드와 데몬 스레드로 나뉜다.
 * 
 * 	데몬 스레드(daemon thread)는 다른 일반 스레드(데몬 스레드가 아닌 스레드)의
 * 	작업을 돕는 보조적인 역할을 수행하는 스레드다.
 * 	일반 스레드가 모두 종료되면 데몬 스레드는 강제적으로 자동 종료된다.
 * 	데몬 스레드의 존재의 의미가 없기 때문이다.
 * 	이 점을 제외하고는 데몬스레드와 일반 스레드는 다르지 않다.
 * 	데몬 스레드의 예로는 가비지 컬렉터, 워드프로세서의 자동저장, 미디어 플레이어의 동영상 및 음악재생 등이 있다.
 * 	이 기능들은 주 스레드 JVM, 워드프로세서, 미디어 플레이어가 종료되면 같이 종료된다.
 * 
 * 	데몬 스레드는 무한루프와 조건문을 이용해서 시행 후 대기하고 있다가 특정 조건이 만족되면
 * 	작업을 수행하고 다시 대기하도록 작성한다.
 * 
 * 	데몬 스레드 사용법
 * 	스레드 생성 -> 반드시 setDaemon(true)메서드 호출 -> start()메소드 호출
 * 	void setDaemon(boolean on) : true(데몬 스레드로 설정), false(일반 스레드로 설정)
 */
package ex17_05_daemon_thread;
public class ThreadEx {
	public static void main(String[] args) {
		Thread t = new Thread(new Threadautosave());
		t.setDaemon(true);	//이 부분이 없으면 종료되지 않는다. 데몬스레드로 만든다.
		
		t.start();
		
		for(int i=1;i<=30;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i);
			
			if (i==5)
				Threadautosave.autoSave = true;
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
