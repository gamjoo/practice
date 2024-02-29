package ex06_1_array;

public class ArrayTest03_MAXMIN_Answer {
	public static void main(String[] args) {
		int[] data = { 20, 30, 40, 80, 10 };
		// max, min의 초기값으로 배열 의 값 중에서 설정
		int max = data[0];
		int min = data[0];

		for (int i = 1; i < data.length; i++) {
			if (max < data[i])
				max = data[i];
			if (min > data[i])
				min = data[i];

			/*
			   for (int i = 1; i <data.length; i++) { max = (max > data[i]) ? max : data[i];
			   min = (min < data[i]) ? min : data[i]; }
			 */

			System.out.println("max = " + max);
			System.out.println("min = " + min);

		}
	}

}
