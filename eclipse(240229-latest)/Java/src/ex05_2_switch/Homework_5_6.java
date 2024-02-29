package ex05_2_switch;

import java.io.InputStream;
import java.util.Scanner;

public class Homework_5_6 {
	public static void main(String[] args) {
		
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		System.out.print("limit : ");
		int limit = sc.nextInt();
		
		System.out.print("listcount : ");
		int listcount = sc.nextInt();
		
		int maxpage1 = (listcount-1)/limit + 1;
		System.out.println(listcount + "=>" + maxpage1);
		
		int maxpage2 = (listcount - 1 + limit) / limit;
		System.out.println(listcount + "=>" + maxpage2);
		
		System.out.println("page를 입력하세요:");
		int page, startpage;
		page = sc.nextInt();
		startpage = (page-1)/10 * 10 + 1;
		System.out.println("startpage=" + startpage);

		
		
		
//		System.out.print("limit를 입력하세요:");
//		int num3 = sc.nextInt();
//
//		System.out.print("listcount를 입력하세요:");
//		int num4 = sc.nextInt();
//		int num5 = ((num4-1)/num3)+1;
//		
//		System.out.println("maxpage = "+num5);
		
		sc.close();
		
		}

	}
