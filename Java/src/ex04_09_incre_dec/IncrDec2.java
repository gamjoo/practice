package ex04_09_incre_dec;

public class IncrDec2 {
	public static void main(String[] agrs) {
		int n1 = 10, n2 = 10, n3 = 10, n4 = 10;
		
		// 증가하고 출력
		// n1 = n1 + 1;
		// System.out.println(n1)
		System.out.println(++n1); //11
		System.out.println(n1); //11
		
		//System.out.println(n2)
		//n2 = n2 + 1;
		System.out.println(n2++); //10. 출력을 먼저하고, 1 더해서 n2에 저장
		System.out.println(n2); //11. 위에서 저장된 n2를 출력함
		
		System.out.println(--n3); //9
		System.out.println(n3); //9
		
		System.out.println(n4--); //10
		System.out.println(n4); //9
	}

}
