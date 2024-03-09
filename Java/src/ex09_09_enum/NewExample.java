//사계절을 표현하는 코드 값을 상수로 선언해서 사용하는 예
//의류 정보 클래스

package ex09_09_enum;
public class NewExample {
	public static void main(String[] args) {
		//Season.SUMMER에서 Season은 열거 타입 이름, SUMMER는 열거 상수 이름이다.
		ClothingInfo obj = new ClothingInfo
				("32919", "반팔 티셔츠", "면100%", Season.SUMMER);
		System.out.println("상품코드: " + obj.code);
		System.out.println("상품명: " + obj.name);
		System.out.println("소재: " + obj.material);
		
		//열거 상수의 이름 출력
		System.out.println("계절구분: " + obj.season);
	}
}