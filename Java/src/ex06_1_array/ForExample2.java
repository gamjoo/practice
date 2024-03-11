package ex06_1_array;

public class ForExample2 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		
		//향상된 for문, 확장 for문
		for (int num : arr) {
			System.out.println(num);
		}
		
		System.out.println("End.");
	}

}
