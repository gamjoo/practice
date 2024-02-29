package ex06_1_array;

import java.util.Scanner;

public class ArrayTest06_2_back_String {
	public static void main(String[] args) {
		
		String[] names = new String[] {"홍길동", "전우치", "홍길동", "세종대왕", "김길동" };
		
		Scanner sc = new Scanner(System.in);
		int index = -1;
		// 몇 번 방에 들어있는지 확인하는 변수로 초기값 -1은
		// 인덱스와 겹치지 않는 수를 사용함.
		
		System.out.println("검색할 이름을 입력하세요?");
		System.out.print("이름:");
		String inputname = sc.next();
		
//		for (int i=4; i<=names.length&&i>=0; i--) {
//			if (inputname.equals(names[i])) {
//				index = i;
//				break;
//			}
//		}
		
		
		//뒤에서부터도 탐색할 수 있다.
		for (int i = names.length-1; i>=0 ;--i) { //i=4,3,2,1,0
			if (inputname.equals(names[i])) {
				index = i;  //마지막 인덱스 위치에서부터 입력한 이름과 같은 이름을 찾는다
				break;		//입력한 이름과 같은 이름을 찾으면 반복문을 벗어난다
			}
		}
		
		//입력한 이름과 배열에 저장된 이름을 찾았을 때 출력 명령문
		if (index != -1) {
			System.out.println(inputname + "는(은) 배열의 인덱스 "+index+"에서 찾았습니다.");
		} else
			System.out.println(inputname + "는(은) 배열방에서 찾지 못했습니다.");
		
		sc.close();
	}

}