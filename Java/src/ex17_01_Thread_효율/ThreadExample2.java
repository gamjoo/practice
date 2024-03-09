/* 
 * 	ThreadExample2.java는 사용자로부터 입력을 받는 작업과 화면에 숫자를 출력하는
 *  작업을 2개의 쓰레드로 나누어서 처리하기 때문에 사용자가 입력을 마치지 않아도
 *  화면에 숫자가 출력된다.
 */
package ex17_01_Thread_효율;
import java.util.Scanner;
public class ThreadExample2 {
	public static void main(String[] args) {
		DigitThread th1 = new DigitThread();
		th1.start();
		
		System.out.println("아무거나 입력하세요~");
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하신 내용은 \"" + sc.nextLine() + "\" 입니다.");
		
		sc.close();
	}

}