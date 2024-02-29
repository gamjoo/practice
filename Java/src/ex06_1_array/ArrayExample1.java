package ex06_1_array;

public class ArrayExample1 {
	public static void main(String args[]) {
		int[] arr;				//배열 변수를 선언
		arr = new int[10];		//배열 생성
		
		//배열 사용
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = arr[0] + arr[1];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[9]);
		
		//java.lang.ArrayIndexOutOfBoundsException
		System.out.println(arr[10]); //컴파일 오류는 발생하지 않지만, 실행하면 오류
									 //크기보다 범위를 벗어나서 선언할 때
	}

}