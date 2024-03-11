package ex05_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class Grade_3 {
	public static void main(String[] args) {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		
		System.out.println("점수를 입력하세요>");
	
	int jumsu = sc.nextInt();
	
	String grade = "F";
	
//	if (jumsu >= 90) {
//		grade="A";
//	} else if (jumsu >= 80) {
//		grade="B";
//	} else if (jumsu >= 70) {
//		grade="c";
//	} else if (jumsu >= 60) {
//		grade="D";
//	}
//	
//	System.out.println(grade + "학점");
	
	int mok = jumsu/10;
	if (mok >= 9) {
		grade="A";
	} else if (mok >= 8) {
		grade="B";
	} else if (mok >= 7) {
		grade="c";
	} else if (mok >= 6) {
		grade="D";
	}
	
	System.out.println(grade + "학점");

	
	sc.close();

	}
}
