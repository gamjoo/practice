package ex05_6_break;

public class BreakExample2 {
	public static void main(String args[]) {
		
		int cnt, cnt2;
		
		for (cnt2=0; cnt2<10; cnt2++) {			
			for (cnt=0; cnt<10; cnt++) {
			System.out.println("("+cnt2+", "+cnt+")");
				if (cnt == 4)
				break;  //break를 내포하는 반복문 밖으로 제어가 이동합니다.
		}
				if (cnt2 == 2)
				break;
		}
		
		System.out.println("End.");
	}

}
