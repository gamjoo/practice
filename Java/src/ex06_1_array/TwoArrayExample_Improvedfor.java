package ex06_1_array;

import java.util.Arrays;

public class TwoArrayExample_Improvedfor {
	public static void main(String[] args) {
		int arr[][] = {
				{10, 20},
				{30, 40},
				{50}
		};
		
//		for (int i=0; i<arr.length; i++) {
//			for (int j=0; j<arr[i].length; j++) {
//				System.out.printf("%-3d",arr[i][j]);
//				if (j==1) {
//					System.out.println();
//				}
//			}
//		}
		
//		for (int i = 0; i<arr.length; i++) {
//			for (int j=0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//			// 안쪽 for문 한바퀴 돌면, 다음 명령문으로 이동하니까
//			// 굳이 if문으로 표현 안 해줘도 됐었음!!
//			// 내가 작성한 명령문의 결과가 어떻게 나올까 항상 생각해!!
//		}
//		System.out.println("==========================");
		
		for (int[] a : arr) { //arr이 가르키고 있는 각 요소들은 1차원 배열
			for (int n : a) { //a 배열이 갖고 있는 요소들을 또 다시 배열하라는 for문
				System.out.print(n + " ");
			}
			System.out.println();
		}
		System.out.println("끝.");
	}

}
