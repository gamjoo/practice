package ex04_12_conditional_op;

public class ConditionalOpExample1_max {
	public static void main(String[] args) {
		int a = 30, b = 10, max, min;
		
		System.out.println(a > b ? a : b);
		
		max = a > b ? a : b;
		System.out.println("최댓값 = " + max);
		
		
		min = a < b ? a : b;
		System.out.println("최솟값 = " + min);
	}

}