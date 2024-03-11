package ex05_2_switch;

public class SwitchExample3_1 {
	public static void main(String args[]) {
		String ch = "G"; // "G" 스트링은 더블코트. 캐릭터는 싱글코트.
		
		switch (ch) {
			case "A" :
			case "a" :
				System.out.println("사과");
				break;
				
			case "P" :
			case "p" :
				System.out.println("배");
				break;
				
			case "G" :
			case "g" :
				System.out.println("포도");
				break;
			
			default :
				System.out.println("?");
				
		}
		
		System.out.println("끝");
	
	}

}