package ex04_07_concate_op;

import java.util.Scanner;

public class Assignment_231227 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int inputdata = sc.nextInt();
		int output = (inputdata-1)/10;
		System.out.println(output);
		sc.close();
		
	}
}
