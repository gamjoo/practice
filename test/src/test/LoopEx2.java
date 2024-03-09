package test;

public class LoopEx2 {

	public static void main(String[] args) {
		
		// 구구단 예제
//		for (int i=2; i<=9; i++) {
//			System.out.println(i+"단");
//			for (int j=1; j<=9; j++) {
//				System.out.println(i + "*" + j + "=" + i*j);
//			}
//			System.out.println();
//		}
		
		// break
		for (int i=0; i<=10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
		}
		
		// continue
		for (int i=0; i<=10; i++) {
			if (i == 6) {
				continue;
			}
			System.out.println(i);
			
		}

	}

}
