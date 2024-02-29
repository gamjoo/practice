package ex04_01_local_variable;

public class Local5 {

	public static void main(String[] n) {
		int num = 20;
		System.out.println("2="+num);
		
		int num = 10; //Duplicate local variable num
		System.out.println("1="+num);
	}

}