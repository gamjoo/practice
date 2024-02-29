package ex06_1_array;

public class ArrayTest03 {
	public static void main(String[] args) {
		
		int[] data = {20, 30, 40, 80, 10};
//		int Max = (data[0] > data[1]) ? data[0] : data[1];
//			Max = (Max > data[2]) ? Max : data[2];
//			Max = (Max > data[3]) ? Max : data[3];
//			Max = (Max > data[4]) ? Max : data[4];

		int Max = 0; //배열 값중 하나를 입력했어야 함
		for (int i=0; i<4; i++) {
			Max = data[i] > data[i+1] ? data[i] : data[i+1];
		}
		
//		int Min = (data[0] < data[1]) ? data[0] : data[1];
//			Min = (Min < data[2]) ? Min : data[2];
//			Min = (Min < data[3]) ? Min : data[3];
//			Min = (Min < data[4]) ? Min : data[4];
		
		int Min = 0; //배열 값중 하나를 입력했어야 함
		for (int i=0; i<4; i++) {
			Min = data[i] < data[i+1] ? data[i] : data[i+1];
		}
			
		System.out.println("max = "+Max);
		System.out.println("max = "+Min);
	}

}
