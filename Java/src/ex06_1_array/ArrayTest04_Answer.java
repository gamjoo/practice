package ex06_1_array;

import java.util.Scanner;

public class ArrayTest04_Answer {
	public static void main(String[] args) {
		int[] su = new int[5];

		System.out.println("정수 5개를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		su[0] = sc.nextInt();
		int max = su[0], min = su[0];

		for (int i = 1; i < su.length; i++) {
			su[i] = sc.nextInt();
			if (max < su[i])
				max = su[i];
			if (min > su[i])
				min = su[i];
		}

		System.out.println("max = " + max);
		System.out.println("min = " + min);

		sc.close();

	}

}
