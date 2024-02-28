package ex04_12_conditional_op;

import java.io.InputStream;
import java.util.Scanner;

public class 과제_1_MAXMIN {
	public static void main(String[] args) {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);

		System.out.print("3개의 정수를 입력하세요? ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
//		int max, min;
//		max = n1 < n2 ? n2 : n1;
//		max = n2 < n3 ? n3 : n2;
//		max = n1 < n3 ? n3 : n1;
//		System.out.println("max = "+max);
//		System.out.println(n1+","+n2+","+n3+" 중 가장 큰 수는 "+max+"입니다.");
//	
//		min = n1 < n2 ? n1 : n2;
//		min = n3 < n1 ? n3 : n1;
//		min = n2 < n3 ? n2 : n3;
//		System.out.println("min = "+min);
//		System.out.println(n1+","+n2+","+n3+" 중 가장 작은수는 "+min+"입니다.");

		int max = (n1 > n2) ? n1 : n2;   //여기 논리 중요함
			max = (max > n3) ? max : n3; //여기 논리 중요함
			
		int min = (n1 < n2) ? n1 : n2;	 //여기 논리 중요함
			min = (min < n3) ? min : n3; //여기 논리 중요함
			
		sc.close();
	}
}