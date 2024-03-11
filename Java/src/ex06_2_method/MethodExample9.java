package ex06_2_method;

public class MethodExample9 {
	public static void main(String[] args) {
		int num=50;
		char data='*';
		print(num, data);
	}
	
	   public static void print(int p_num, char p_data) { //자바에서 값을 전달받으려면 자료형을 명시해야 함
		   System.out.println("print() 메서드 입니다.");
		   System.out.println("main() 메서드에서 전달받은 데이터의 값은 " + p_num + ", " + p_data + "입니다.");

		   }
}
