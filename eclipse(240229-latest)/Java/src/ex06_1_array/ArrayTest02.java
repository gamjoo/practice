package ex06_1_array;

import java.util.Scanner;

public class ArrayTest02 {
	public static void main(String[] args) {

		System.out.println("정수 5개를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		
//		int[] score = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
//
//		int sum = 0;
//		for (int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//
//		System.out.println("합 = " + sum);
//		System.out.println("평균 = " + (sum / score.length));
//
//		sc.close();
//		
		int sum=0;
		int[] score = new int[5];
		
		for (int i=0;i<score.length;i++) {
			score[i]=sc.nextInt();
			sum += score[i];
		}
		
		double avg=(double)sum/(score.length);  //avg=(double)sum/5;
		System.out.println("합 = "+sum+"\n평균 = "+ avg);
		
		System.out.println("====================");
		System.out.printf("합 =%5d%n평균 =%5.1f", sum, avg);
		sc.close();
	}
}