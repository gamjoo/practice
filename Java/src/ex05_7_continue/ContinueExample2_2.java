package ex05_7_continue;

public class ContinueExample2_2 {
	public static void main(String[] args) {
		
		int cnt = -1;				//5만 빼고 출력
		while (++cnt < 10) {
			if (cnt == 5)
			continue;
			System.out.println(cnt);
		}
		
		System.out.println("끝.");
	}

}
