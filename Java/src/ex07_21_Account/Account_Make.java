package ex07_21_Account;

public class Account_Make {
	public static void main(String[] args) {
		Account obj = new Account("777-777-7777777", "최대박", 10);
		try {
			int amount = obj.withdraw(100000000);
			System.out.println("인출액:" + amount);
			//try에서 오류 문장을 만나면, catch 문으로 넘어감
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}
}
