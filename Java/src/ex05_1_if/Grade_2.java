/*
90~       "A학점"
80~89     "B학점"
70~79     "C학점"
60~69     "D학점"
60미만     "F학점"

if~else if문으로 작성합니다.
 */

package ex05_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class Grade_2 {
	public static void main(String[] args) {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		
		System.out.println("점수를 입력하세요>");
//		int sco = sc.nextInt();
		
//		if (sco>=90) {
//			System.out.println("A학점");
//		} else if (sco>=80) {
//			System.out.println("B학점");
//		} else if (sco>=70) {
//			System.out.println("C학점");
//		} else if (sco>=60) {
//			System.out.println("D학점");
//		} else {
//			System.out.println("F학점");
		
		int jumsu = sc.nextInt();
		
		String grade = "F";
		
		if (jumsu >= 90) {
			grade="A";
		} else if (jumsu >= 80) {
			grade="B";
		} else if (jumsu >= 70) {
			grade="c";
		} else if (jumsu >= 60) {
			grade="D";
		}
		
		System.out.println(grade + "학점");
		
		sc.close();
		}
	}
