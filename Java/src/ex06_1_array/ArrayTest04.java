package ex06_1_array;

import java.util.Scanner;

public class ArrayTest04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요?");

		int[] data = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };

		int max = data[0]; //초기값은 입력한 데이터 중 하나를 대입해야 함
		int min = data[0];

		for (int i = 1; i < data.length; i++) {
			if (max < data[i])
				max = data[i];
			if (min > data[i])
				min = data[i];
		}
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);

		sc.close();

	}
}
