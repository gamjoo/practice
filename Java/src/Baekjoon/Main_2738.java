package Baekjoon;

import java.util.Scanner;

public class Main_2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int[][] c = new int[a][b];
		int[][] d = new int[a][b];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				c[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				d[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(c[i][j] + d[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}