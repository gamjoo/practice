//obj변수에 null이라는 참조값이 있기 때문에 컴파일 에러는 없지만
//실행시 에러 발생(런타임 에러 발생)

package ex09_02_null;
public class RefTypeExample4 {
	public static void main(String[] args) {
		Point obj = null; //아무 데이터도 가리키지 않는 참조값
		System.out.println(obj.x); //NullPointerException : 객체를 생성하지도 않았는데 사용했다.
		System.out.println(obj.y);
	}
}