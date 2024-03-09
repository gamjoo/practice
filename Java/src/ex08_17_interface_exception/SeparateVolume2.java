//대출 가능 인터페이스를 구현하는 단행본 클래스
//SeparateVolume 클래스는 Lendable 인터페이스를 구현한다 라고 한다.

package ex08_17_interface_exception;

public class SeparateVolume2 implements Lendable {

	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	byte state;

	SeparateVolume2(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	//부모 클래스의 메소드보다 더 큰 범위의 예외를 선언할 수 없다.
	 public void checkOut(String borrower, String date) throws Exception
	 {
		if (state != STATE_NORMAL)
			throw new Exception("*대출불가:" + bookTitle);
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = STATE_BORROWED;	// 필드의 state를 바꿔야 함
		System.out.println("*" + bookTitle + " 이(가) 대출되었습니다.");
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + date);

	}

	public void checkIn() {
		borrower = null;
		checkOutDate = null;
		state = STATE_NORMAL;
		System.out.println("*" + bookTitle + " 이(가) 반납되었습니다.\n");

	}

}
