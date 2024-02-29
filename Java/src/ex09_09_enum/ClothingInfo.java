//사계절을 표현하는 코드 값을 상수로 선언해서 사용하는 예
//의류 정보 클래스

package ex09_09_enum;
public class ClothingInfo {
		String code;
		String name;
		String material;
		Season season; 		//열거형은 참조형변수 season에는 열거 상수만 대입할 수 있다
		
		ClothingInfo(String code, String name,
					 String material, Season season) {
			this.code = code;
			this.name = name;
			this.material = material;
			this.season = season;
			
			//this.season = 5; 컴파일 에러 발생
		}
}
