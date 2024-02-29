//Runnable 인터페이스를 이용한 멀티스레드 프로그램
package ex17_04_Runnable_Interface;
public class MultithreadExample1 {
	public static void main(String[] args) {
		//Runnable인터페이스를 구현하는 클래스 객체를 생성해서 Thread 생성자의 파라미터로 사용한다.
		SmallLetters small = new SmallLetters();
		Thread thread = new Thread(small); //스레드 생성. Runnable형으로 자동 형변환
		thread.start();
		
		char arr[] = {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅌ','ㅍ','ㅎ'};
		
		for (char ch : arr)
			System.out.print(ch);
	}

}
