package ex08_15_01_interface_polymorphism;

public interface Lendable {

	//대출한다.
	public abstract void checkOut(String borrower, String date);

	//반납한다.
	public abstract void checkIn();

}