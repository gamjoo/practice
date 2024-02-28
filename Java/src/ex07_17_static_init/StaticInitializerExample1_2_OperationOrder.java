package ex07_17_static_init;

public class StaticInitializerExample1_2_OperationOrder {
	public static void main(String args[]) {
		System.out.println("main 실행시작");
		HundredNumbers h = new HundredNumbers();
		HundredNumbers h2 = new HundredNumbers();
		
		//HundredNumbers class에서 static{}에 초기화 된 내용을 한번 실행
		//배열에 있는 항목들 중 3개의 항목을 가져와서 그 값을 출력합니다.
		System.out.println(HundredNumbers.arr[35]);
		System.out.println(HundredNumbers.arr[27]);
		System.out.println(HundredNumbers.arr[63]);
	}

}


//  (0) HundredNumbers.arr[35] 명령을 수행하기 위해 HundredNumbers Class 멤버들이 Method Area로 이동함
//  (1) HundredNumbers class 안에 클래스 초기화 블럭 ->
//  (2) 객체를 생성하면서 생성자 호출 ->
//  (3) System.out.println 명령문실행