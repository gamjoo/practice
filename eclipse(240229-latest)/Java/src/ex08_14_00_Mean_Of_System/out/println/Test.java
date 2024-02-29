//java.lang 패키지에 있는 항목들은 따로 import를 해주지 않아도 됨
//System 클래스는 API문서 들어가보면, constructor 즉, 생성자가 정의되어 있지 않음

package ex08_14_00_Mean_Of_System.out.println;

import java.io.PrintStream;

public class Test {
	public static void main(String[] args) {

		PrintStream out = System.out; //JVM 내부에서 객체 생성

		out.println("모니터에 출력합니다"); // 인스턴스 변수이므로 참조변수를 통해 접근해야 함

	}

}
