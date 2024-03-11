/*
 * 정수형 변수 num을 선언하고 정수값을 입력받아 저장합니다.
 * 1. 입력받은 값이 10미만이면                     "num의 값은 10 미만입니다."
 * 2. 입력받은 값이 10 이상, 100 미만이면           "num의 값은 10 이상, 100 미만입니다."
 * 3. 입력받은 값이 100 이상, 1000 미만이면         "num의 값은 100 이상, 1000 미만입니다."
 * 4. 입력받은 값이 1000 이상이면                  "num의 값은 1000 이상입니다."
 * 
 * if(){
  
   }else if(){
  
   }else if(){
   
   }else{
   
   }
 */

package ex05_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class IfExample5 {
	public static void main(String args[]) {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		
		System.out.println("정수 num을 입력하세요");
		int num = sc.nextInt();
		
		if(num<10) {
			System.out.println("num의 값은 10 미만입니다.");
			
//		} else if (10 <= num && num<100) {
//			System.out.println("num의 값은 10 이상, 100 미만입니다.");
//		} else if (num >= 100 && num<1000) {
//			System.out.println("num의 값은 100 이상, 1000 미만입니다.");
//		} else {
//			System.out.println("num의 값은 1000이상입니다.");
//		}

			
// 		if문을 타고 그 다음 else if 문으로 넘어가는 거라서 '10 <= num'은 굳이 적지
//		않아도 되는 조건이다	
	} else if (num<100) {
		System.out.println("num의 값은 10 이상, 100 미만입니다.");
	} else if (num<1000) {
		System.out.println("num의 값은 100 이상, 1000 미만입니다.");
	} else {
		System.out.println("num의 값은 1000이상입니다.");
	}
	
	
		sc.close();
	}

}
