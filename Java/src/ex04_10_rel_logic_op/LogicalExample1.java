package ex04_10_rel_logic_op;

public class LogicalExample1 {
	public static void main(String[] args) {
		boolean a = 4 > 3;
		boolean b = 5 > 7;
		System.out.println("a= "+ a); //true
		System.out.println("b= " + b); //false
		
		if (a && b) {
			System.out.println("a&&b가 참");
		}
		
		if (a || b) {
			System.out.println("a||b가 참");
		}
	}

}
