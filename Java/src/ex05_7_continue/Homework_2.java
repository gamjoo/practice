package ex05_7_continue;

public class Homework_2 {
	public static void main(String[] args) {

//		for (int i= 1; i<=1; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for (int i=1; i<=2; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//
//		for (int i=1; i<=3; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//
//		for (int i=1; i<=4; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//
//		for (int i = 1; i <= 5; i++) {
//			System.out.print("*");

		for (int j=1; j<=5; j++) {
			for (int i=1; i<=j; i++) {	//1번 명령문 끝나고
				System.out.print("*");
			}
			System.out.println();		//2번 명령문으로
		}
			
		}
	}