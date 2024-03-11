package ex17_13_notifyall_wait;
public class SimplePrintThread2 extends Thread {

	private SharedArea sharedArea;

	SimplePrintThread2(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	public void run() {
		if (sharedArea.isReady() != true) {//파이가 계산 중인 경우
			
			try {
				synchronized (sharedArea) {
					sharedArea.wait();
					//다른 스레드로부터 신호를 기다린다.
					//파이의 계산이 끝나면 다른 스레드에서 신호를 보낸다.
				}
			}//try end
			catch (InterruptedException e) { //wait 메소드가 발생하는 익셉션 처리
				System.out.println(e.getMessage());
			}//catch end
		}//if end
		
		System.out.printf("*** π = %f ***%n", sharedArea.getResult());
	}

}
