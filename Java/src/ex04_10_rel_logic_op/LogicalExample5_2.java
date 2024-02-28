package ex04_10_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalExample5_2 {

	public static void main(String[] args) {

		InputStream in = System.in;
		Scanner sc = new Scanner(in);

		System.out.println("수를 입력하세요~");
		int num = sc.nextInt();

		if (!(num >= 1 && num <= 10)) {
			System.out.println("(!)1~10 사이의 수가 아닙니다.");
		}

		if (num < 1 || num > 10) {
			System.out.println("1~10 사이의 수가 아닙니다.");
		}

		sc.close();
	}

}
