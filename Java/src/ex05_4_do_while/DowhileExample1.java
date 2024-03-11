package ex05_4_do_while;

public class DowhileExample1 {
	public static void main(String args[]) {
		int cnt=1;
		do {
			System.out.println(cnt); //  1      2     ...    9      10
		} while (cnt++ < 10);		 // 1<10   2<10   ...   9<10   10<10
	}

}
