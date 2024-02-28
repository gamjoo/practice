/*
 * 입력 받은 수가 
          1~9사이면      "10세 미만" 
          10~19 이면    "10대"
          20~29 이면    "20대"    
          30~39 이면    "30대"  
          40~49 이면    "40대"  
          라고 출력합니다.
 * 
*/

package ex04_10_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalExample3_2 {
	public static void main(String[] args) {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);

		System.out.print("나이를 입력하세요>");
		int num = sc.nextInt();

		if (1 <= num && num < 10) {
			System.out.print("1o세 미만");
		} else if (num / 10 >= 1) {
			System.out.print(num / 10 * 10 + "대");
		}
		
/*		최적화 답
		else {
			System.out.println(num/10 * 10+"대");
			System.out.println(num/10+"0대");
*/
		
//		} else if (num/10 ==1) {
//			System.out.print("10대");
//		} else if (num/10 ==2) {
//			System.out.print("2o대");
//		} else if (num/10 ==3) {
//			System.out.print("3o대");
//		} else if (num/10 ==4) {
//			System.out.print("40대");
//		}

//		if (10 <= num && num < 20) {
//			System.out.print("10대");
//		}
//		if (20 <= num && num < 30) {
//			System.out.print("2o대");
//		}
//		if (30 <= num && num < 40) {
//			System.out.print("30대");
//		}
//		if (40 <= num && num < 50) {
//			System.out.print("40대");
//		}		

		sc.close();
	}
}