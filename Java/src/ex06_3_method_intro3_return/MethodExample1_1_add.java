package ex06_3_method_intro3_return;

public class MethodExample1_1_add {
	public static void main(String[] args) {
	
	add(3, 4);
	
	//방법1
	int result = add(3,4);
	System.out.println(result);
	
	//방법2
	System.out.println(add(3,4));
		
	}
	
	public static int add (int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
}
