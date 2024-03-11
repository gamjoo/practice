package ex06_3_method_intro3_return;

import java.util.Scanner;

public class MethodExample4_max_min_array2_input {

	
	/*
	 	public static int[] input() {
	 	int[] data=new int[5];
	 	System.out.print("5개의 정수를 입력하세요?");
	 	Scanner sc = new Scanner(System.in);
	 	
	 	for(int i=0;i<data.length;i++) {
	 		data[i]=sc.nextInt();
	 	}
	 	sc.close();
	 	
	 	return data;
	 */
	
	
	public static int[] input() { //매서드 input
		Scanner sc = new Scanner(System.in);
		System.out.print("5개의 정수를 입력 하세요?");
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int v3 = sc.nextInt();
		int v4 = sc.nextInt();
		int v5 = sc.nextInt();
		int[] input = { v1, v2, v3, v4, v5 }; //변수 input

		sc.close();

		return input;
	}

	public static int max(int[] data1) {
//		data1 = new int[5]; //data를 가져왔는데 새로 만들어서 초기값이 저장되어 있음
		int max = data1[0];

		for (int i = 1; i < data1.length; i++) {
			if (max < data1[i])
				max = data1[i];
		}
		return max;

	}

	public static int min(int[] data1) {
//		data1 = new int[5]; //data를 가져왔는데 새로 만들어서 초기값이 저장되어 있음
		int min = data1[0];

		for (int i = 1; i < data1.length; i++) {
			if (min > data1[i])
				min = data1[i];
		}
		return min;
	}

	public static void main(String[] args) {
		int[] data = input(); 

		int max2 = max(data); //result
		int min2 = min(data); //result

		System.out.println("max = " + max2);
		System.out.println("min = " + min2);
	}

}
