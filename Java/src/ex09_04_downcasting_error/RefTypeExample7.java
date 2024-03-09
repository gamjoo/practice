//에러 발생-슈퍼 클래스 참조 변수의 값을 서브 클래스 참조 변수에 대입하는 잘못된 프로그램
package ex09_04_downcasting_error;
public class RefTypeExample7 {
	public static void main(String[] args) {
		Account obj1 =
				new CheckingAccount("111-22-33333333","홍길동",100000,"5555-6666-7777-8888");
		
		CheckingAccount obj2 = obj1;
		//부모형을 자식형으로 넣을 수 없음
		//컴파일러는 변수의 타입만 보고 대입 가능성을 검사하기 때문에 에러발생
		
		try {
			int amount = obj2.pay("5555-6666-7777-8888",47000);
			System.out.println("인출액: "+amount);
			System.out.println("카드번호: "+obj2.cardNo);
			System.out.println("잔액: "+obj2.balance);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
			//컴파일 오류가 생기는 이유는 뭘까?
			//자바 컴파일러는 컴파일 할 때 변수의 타입만 보고
			//메소드나 필드의 존재 여부를 체크하기 때문에
			//Account 클래스에 pay, cardNo메소드가 있어야 컴파일 에러가 없다
			//but!! 실행할 때는 override된 메소드가 실행된다는 점!!!!!!!!!!!
			
		}
	}
}
