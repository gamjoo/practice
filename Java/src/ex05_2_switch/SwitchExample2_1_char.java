package ex05_2_switch;

public class SwitchExample2_1_char {
	public static void main(String args[]) {
		char ch = 'G'; // "G" 스트링은 더블코트. 캐릭터는 싱글코트.
		
		switch (ch) {
			case 'A' :
			case 'a' :
				System.out.println("사과");
				break;
				
			case 'P' :
			case 'p' :
				System.out.println("배");
				break;
				
			case 'G' :
			case 'g' :
				System.out.println("포도");
				break;
			
			default :
				System.out.println("?");
				
		}
		
		System.out.println("끝"); // switch문 블럭 밖에다 둬야 실행 됨.
								 // 브레이크 걸리면, switch 안에 실행문은 그 단계에서 멈춤
	
	}

}
