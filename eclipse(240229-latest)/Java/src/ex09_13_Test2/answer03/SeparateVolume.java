//대출 가능 인터페이스를 구현하는 단행본 클래스
//SeparateVolume 클래스는 Lendable 인터페이스를 구현한다 라고 한다.

package ex09_13_Test2.answer03;

public class SeparateVolume implements Lendable {

	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	BookState state;

	SeparateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
		this.state = BookState.STATE_NORMAL;
	
	}
	 public void checkOut(String borrower, String date) {
		if (state != BookState.STATE_NORMAL)		
// BookState에서 객체로 만들어졌기 때문에 접근을 BookState. 형태로 해야함
// 상수 대신에 enum을 활용함
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = BookState.STATE_BORROWED;
		System.out.println("*" + bookTitle + " 이(가) 대출되었습니다.");
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + date);

	}

	public void checkIn() {
		borrower = null;
		checkOutDate = null;
		state = BookState.STATE_NORMAL;
		System.out.println("*" + bookTitle + " 이(가) 반납되었습니다.\n");

	}
}
