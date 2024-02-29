package ex07_03_two_constructor;

public class ConstrExample2_method {
	
	public static void main(String args[]) {
		SubscriberInfo obj1 = new SubscriberInfo("연흥부", "poorman", "zebi");
		
		print(obj1);
		
		SubscriberInfo obj2 = new SubscriberInfo("연놀부", "richman",
													"money", "02-123-4567", "강남");
		print(obj2);
		
		
	}
	////////자료형만 유념하면 되고, 변수명은 크게 상관 없음//////
	private static void print(SubscriberInfo a) {
		System.out.println("이름:"+a.name);
		System.out.println("아이디:"+a.id);
		System.out.println("패스워드:"+a.password);
		System.out.println("전화번호:"+a.phoneNo);
		System.out.println("주소:"+a.address);
		System.out.println();
	}

}
