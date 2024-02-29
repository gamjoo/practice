package ex06_2_method;

public class MethodExample11_1 {
	public static void main(String[] args) {
		int num = 50;
		char data = '*';
		print(num, data);
		return;
	}

	public static void print(int p_num, char p_data) {
		for (int i = 0; i < p_num; i++) {
			System.out.print(p_data);
		}
		return;//반환되는 값의 자료형이 void인 경우에는 생략 가능
			   //return 하면, 나를 호출한 곳으로 돌아간다
			   //print는 호출하면 main으로 갈 것이다
	}
	
}
