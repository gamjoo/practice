package ex09_12_enum;

class EnumExample3 {
	public static void main(String args[]) {
			printSeason(Season.SPRING);
//열거 상수를 인자로 입력할 것이기 때문에,, Season.SPRING 으로 입력한다.	
	}
	
	static void printSeason(Season season) {
		System.out.println();
//열거 상수마다 하나씩 객체를 생성한다. (그래서 생성자가 4번 호출됨)
//메소드를 통해 호출하면주어진 열거 상수와 짝을 이룬 값을 리턴한다고만 생각하자
		System.out.println("season.value() = " + season.value());
		/*
		 * 모든 열거형의 조상인 java.lang.Enum 클래스에 정의된 메소드
		 * 1. String name() - 열거형 상수의 이름을 문자열로 반환한다.
		 * 2. int ordinal() - 열거형 상수가 정의된 순서를 반환한다
		 */
		System.out.println("season.name() = " + season.name());
		System.out.println("season.ordinal() = " + season.ordinal());
	}	
}