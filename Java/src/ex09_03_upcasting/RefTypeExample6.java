//생성자가 추가된 직불 계좌 클래스
package ex09_03_upcasting;
public class RefTypeExample6 {
	public static void main(String[] args) {
		Account obj =
				new CheckingAccount("111-22-33333333","홍길동",10,"4444-5555-6666-7777");
		// (Account) 묵시적 형변환
		try {
			int amount = obj.pay("4444-5555-6666-7777",47000);
			//pay 메소드는 Account 클래스에 정의되어 있지 않음
			System.out.println("인출액: "+amount);
			System.out.println("카드번호: "+obj.cardNo);
			//cardNo 필드는 Account 클래스에 정의되어 있지 않음
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
			//(1)obj.pay (2)obj.cardNo 컴파일 오류가 생기는 이유는 뭘까?
			//자바 컴파일러는 컴파일 할 때 변수의 타입만 보고
			//메소드나 필드의 존재 여부를 체크하기 때문에
			//Account 클래스에 pay, cardNo메소드가 있어야 컴파일 에러가 없다
			//but!! 컴파일 후 실행할 때는 override된 메소드를 호출한다!!!!!!!!!!!
            //결국, 업케스팅의 경우는 부모에서 정의된 필드나 메소드만 사용할 수 있다(참조영역축소).
			
		}
	}
}