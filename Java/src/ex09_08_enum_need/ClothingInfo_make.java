//사계절을 표현하는 코드 값을 상수로 선언해서 사용하는 예
//의류 정보 클래스

package ex09_08_enum_need;

public class ClothingInfo_make {
	public static void main(String[] args) {
		ClothingInfo obj = new ClothingInfo
				("32919", "반팔 티셔츠", "면100%", 2);
		System.out.println("상품코드: " + obj.code);
		System.out.println("상품명: " + obj.name);
		System.out.println("소재: " + obj.material);
		System.out.println("계절구분: " + obj.season);

	}

}