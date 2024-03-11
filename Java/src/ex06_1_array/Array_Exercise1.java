package ex06_1_array;

public class Array_Exercise1 {
	public static void main(String[] args) {

//		int[] arr;				배열선언
//		arr = new int[5];		배열생성
//		arr[0] = 10;			배열사용
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 30;
//		arr[4] = 40;

		int[] arr = { 10, 20, 30, 40, 50 };

//		for (int i = 0; i <= 4; i++) {
//			System.out.println("arr[" + i + "]=" + arr[i]);	//배열출력

		for (int i = 0; i < arr.length; i++) {	//배열의 길이를 모르면 length활용
			System.out.println("arr[" + i + "]=" + arr[i]);

		}
	}

}
