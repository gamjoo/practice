package ex09_07_instanceof;
public class RefTypeExample10 {
	public static void main(String[] args) {
		Account obj =
				new Account("111-22-33333333","홍길동",100000);
		
		//obj를 CheckingAccount로 캐스트 가능한 여부 확인((CheckingAccount) obj)
		if (obj instanceof CheckingAccount) {
			//obj를 CheckingAccount로 캐스트할 수 있을 때만 pay메소드 호출
			pay((CheckingAccount) obj);
		} else {
			//obj를 CheckingAccount로 캐스트할 수 없을 경우
			System.out.println("캐스트할 수 없는 타입입니다.");
		}
	}
		
		static void pay(CheckingAccount obj) {
		try {
			int amount = obj.pay("5555-6666-7777-8888",47000);
			System.out.println("인출액: "+amount);
			System.out.println("카드번호: "+obj.cardNo);
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
