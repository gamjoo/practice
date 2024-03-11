package ex06_2_method;

public class MethodExample12 {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		print(num);
		return;
	}
	
	public static void print(int[] parameter) {
		for (int i = 0; i < parameter.length; i++) {
//			System.out.printf("%-2d", parameter[i]);
			System.out.print(parameter[i]+" ");
//향상된 for문 이용해서 출력해도 됨	
		}
	}
		
}
