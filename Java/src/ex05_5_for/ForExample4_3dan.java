package ex05_5_for;

import java.util.Scanner;

public class ForExample4_3dan {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요>");
//		int dan = sc.nextInt();

		
//		for문 안에 for문이..
		
		int i;
		int dan;

		for (dan = 2; dan <= 9; dan += 1) {
			for (i = 1; i < 10; i += 1) {
				System.out.println(dan + "*" + i + "=" + dan * i);
			}
		}
			

//		for (i=1; i<10; i+=1) {
//			System.out.println(dan+"*"+i+"="+dan*i);
			
		
		}
		
//		sc.close();
	}
