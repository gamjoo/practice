package ex09_13_Test2.answer03;
interface Lendable {
	//final static byte STATE_BORROWED = 1; //대출 중
	//final static byte STATE_NORMAL = 0;	//대출 X
	void checkOut(String borrower, String date);
	void checkIn();
}
