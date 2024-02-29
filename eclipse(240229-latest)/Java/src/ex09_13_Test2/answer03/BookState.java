package ex09_13_Test2.answer03;

enum BookState {
	//컴파일러에 의해 STATE_NORMAL STATE_BORROWED 객체가 생성된다
	STATE_NORMAL("대출 가능"), STATE_BORROWED("대출 중");
	private final String check;
	
	private BookState(String check) {
		this.check = check;
	}
	
	String value() {
		return check;
	}
}
