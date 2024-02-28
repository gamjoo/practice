package ex04_10_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalExample4 {
	public static void main(String[] args) {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		int num;
		
		System.out.print("수를 입력하세요>");
		num = sc.nextInt();
		
		if (num == 1 || num == 11) {
			System.out.println("1 또는 11입니다.");
		} else {
			System.out.println("1 또는 11이 아닙니다.");
		}
		
		sc.close(); //세미클론을 찍지 않아도, 작동하는데 무슨 차이..?
	}

}
