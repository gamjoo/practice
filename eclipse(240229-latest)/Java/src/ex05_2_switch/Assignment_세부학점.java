/*
 95 ~  100 : A+      
 90 ~   94 : A0      
 85 ~   89 : B+
 80 ~   84 : B0
 75 ~   79 : C+
 70 ~   74 : C0
 65 ~   69 : D+
 60 ~   64 : D0
 0   ~  59 : F 
 */

package ex05_2_switch;

import java.io.InputStream;
import java.util.Scanner;

public class Assignment_세부학점 {
	public static void main(String[] args) {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		
		System.out.println("점수를 입력하세요?");
//		int score = sc.nextInt();
		int s = sc.nextInt();
		
//		switch (score) {
//		case 100 :
//		case 99 :
//		case 98 :
//		case 97 :
//		case 96 :
//		case 95 :
//			System.out.println("A+학점");
//			break;
//		case 94 :
//		case 93 :
//		case 92 :
//		case 91 :
//		case 90 :
//			System.out.println("A0학점");
//			break;
//		case 89 :
//		case 88 :
//		case 87 :
//		case 86 :
//		case 85 :
//			System.out.println("B+학점");
//			break;
//		case 84 :
//		case 83 :
//		case 82 :
//		case 81 :
//		case 80 :
//			System.out.println("B0학점");
//			break;
//		case 79 :
//		case 78 :
//		case 77 :
//		case 76 :
//		case 75 :
//			System.out.println("C+학점");
//			break;
//		case 74 :
//		case 73 :
//		case 72 :
//		case 71 :
//		case 70 :
//			System.out.println("C0학점");
//			break;
//		case 69 :
//		case 68 :
//		case 67 :
//		case 66 :
//		case 65 :
//			System.out.println("D+학점");
//			break;
//		case 64 :
//		case 63 :
//		case 62 :
//		case 61 :
//		case 60 :
//			System.out.println("D0학점");
//			break;
//			
//			default :
//				System.out.println("F학점");
		
		
// 반복되는 값이 5개 이므로, 이것을 활용하면 쉽게 구할 수 있음		
	
		String grade = "F";
		s = s/5;
		switch (s) {
		case 20:
		case 19:
			grade="A+";
			break;
		case 18:
			grade="A0";
			break;
		case 17:
			grade="B+";
			break;
		case 16:
			grade="B0";
			break;
		case 15:
			grade="C+";
			break;
		case 14:
			grade="C0";
			break;
		case 13:
			grade="D+";
			break;
		case 12:
			grade="D0";
			break;
			
			default :
				System.out.println("F학점");
		
		}
		
		System.out.println(grade + "학점");
		sc.close();		
	}

}
