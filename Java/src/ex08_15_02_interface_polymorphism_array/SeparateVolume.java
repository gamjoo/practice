//대출 가능 인터페이스를 구현하는 단행본 클래스
//SeparateVolume 클래스는 Lendable 인터페이스를 구현한다 라고 한다.

package ex08_15_02_interface_polymorphism_array;

public class SeparateVolume implements Lendable {

	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	byte state;

	//필드에 선언된 값을 변수를 통해 들어온 값으로 변경 하도록
	SeparateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	//인터페이스에서 abstract 메소드를 구현하는 클래스에서는 메소드를 public으로 해야 함
	 public void checkOut(String borrower, String date) {
		if (state != 0)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;	// 필드의 state를 바꿔야 함
		System.out.println("*" + bookTitle + " 이(가) 대출되었습니다.");
		System.out.println("저  자 :"+writer); //추가된 부분
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + date + "\n");

	}

	public void checkIn() {
		borrower = null;
		checkOutDate = null;
		state = 0;
		System.out.println("*" + bookTitle + " 이(가) 반납되었습니다.\n");

	}

}
