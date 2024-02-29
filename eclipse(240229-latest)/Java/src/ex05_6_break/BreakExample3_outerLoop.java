package ex05_6_break;

public class BreakExample3_outerLoop {
	
/*
 	레이블 블록
 	형식) 레이블 명 : {문장블록} 또는 반복문이 포함된 블록
 	예)
 	aa:{
 		System.out.println("aa");
 	}
 	
 	bb: for(int i=0;i<10;i++){
 		break bb;
 	}	
 */

	public static void main(String args[]) {

		int cnt, cnt2;

		outerLoop : 
		for (cnt2 = 0; cnt2 < 3; cnt2++) {
			for (cnt = 0; cnt < 5; cnt++) {
				System.out.println("(" + cnt2 + ", " + cnt + ")");
				if ((cnt2 == 1) && (cnt == 2))
					break outerLoop;
			}

		}
		System.out.println("End.");

	}
	
}
