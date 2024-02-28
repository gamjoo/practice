package ex06_1_array_main;

public class Main_arg2 {
	public static void main(String[] args) {

//		for(int i=0;i<args.length;i++) {
//			System.out.println(args[i]);
//		}

		// 향상된 for문을 이용하면 배열에 저장된 내용을 쉽게 출력해볼 수 있다.

		for (String a : args) {
			System.out.println(a);
		}
	}
}