package test;

public class SwitchEx {

	public static void main(String[] args) {
		
		// switch문 정수값 비교
		int grade = 2;
		
		switch(grade) {
		case 1:
			System.out.println("1등급");
			break;
		case 2:
			System.out.println("2등급");
			break;
		case 3:
			System.out.println("3등급");
			break;
		default :
			System.out.println("기타");
		}
		
		// switch 연산식으로
		int score = 50;
		switch (score / 10) {
		case 9 :
			System.out.println("A+");
			break;
		case 8 :
			System.out.println("A");
			break;
		case 7 :
			System.out.println("B");
			break;
		case 6 :
			System.out.println("C");
			break;
			default :
				System.out.println("D");
		}
		
		// 문자열
		String city = "전주";
		switch(city) {
		case "서울" :
			System.out.println("서울에 살고있습니다.");
			break;
		case "제주" :
			System.out.println("제주에 살고있습니다.");
			break;
			default :
				System.out.println("기타 지역");
		}
		
		// switch문을 if문으로 변환
		if (grade == 1) {
			System.out.println("1등급");
		} else if (grade == 2) {
			System.out.println("2등급");
		} else if (grade == 3) {
			System.out.println("3등급");
		} else {
			System.out.println("기타");
		}

	}

}
