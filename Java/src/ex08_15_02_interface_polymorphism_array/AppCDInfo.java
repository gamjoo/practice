package ex08_15_02_interface_polymorphism_array;

public class AppCDInfo extends CDInfo implements Lendable {
	String borrower;
	String checkOutDate;
	String writer;				//추가된 부분1
	byte state;
	
	//부모 생성자 호출 후, 매개변수 넘겨주면 부모 생성자 블록 내의 기능을 수행함
	AppCDInfo(String registerNo, String title, String writer) {
		super(registerNo, title);
		this.writer = writer;		//추가된 부분2
	}

	public void checkOut(String borrower, String date) {
		if (state != 0)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1; // 필드의 state를 바꿔야 함
		System.out.println("*" + title + " CD가 대출되었습니다.");
		System.out.println("저    자:"+writer); //추가된 부분3
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + date + "\n");
	}

	public void checkIn() {
		borrower = null;
		checkOutDate = null;
		state = 0;
		System.out.println("*" + title + " CD가 반납되었습니다.\n");

	}

}