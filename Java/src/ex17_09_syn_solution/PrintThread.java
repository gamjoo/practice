package ex17_09_syn_solution;
public class PrintThread extends Thread {

	private SharedArea sharedArea;
	
	PrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	public void run() {
			for(int i=0; i<3; i++) {
			/*
			 * synchronized 키워드를 사용해서 블록으로 묶은 부분을 동기화 블럭이라고 한다.
			 */
			synchronized (sharedArea) {
			//동기화 시작	
			int sum =
			  sharedArea.getAccount1().getBalance() 
			+ sharedArea.getAccount2().getBalance();
			System.out.println("계좌 잔액 합계:  " + sum);
			}
			//동기화 끝
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
