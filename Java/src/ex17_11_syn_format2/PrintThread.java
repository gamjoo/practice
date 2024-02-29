package ex17_11_syn_format2;
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

			//동기화 시작	
			int sum = sharedArea.getTotal();
			//동기화 끝
			
			System.out.println("계좌 잔액 합계 : " + sum);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
