package ex07_03_two_constructor;

public class ConstrExample1 {
	public static void main(String[] args) {
		SubscriberInfo obj1 = new SubscriberInfo("연흥부", "poorman", "zebi");
		
		System.out.println("이름:"+obj1.name);
		System.out.println("아이디:"+obj1.id);
		System.out.println("패스워드:"+obj1.password);
		System.out.println("전화번호:"+obj1.phoneNo);
		System.out.println("주소:"+obj1.address);
		System.out.println("==========================");
		
		obj1.setAddress("서울시 종로구");
		obj1.setPhoneNo("010-1234-1234");
		System.out.println("이름:"+obj1.name);
		System.out.println("아이디:"+obj1.id);
		System.out.println("패스워드:"+obj1.password);
		System.out.println("전화번호:"+obj1.phoneNo);
		System.out.println("주소:"+obj1.address);
		System.out.println("==========================");
		
		SubscriberInfo obj2 = new SubscriberInfo("연놀부", "richman","money","02-123-4567","강남");
		System.out.println("이름:"+obj2.name);
		System.out.println("아이디:"+obj2.id);
		System.out.println("패스워드:"+obj2.password);
		System.out.println("전화번호:"+obj2.phoneNo);
		System.out.println("주소:"+obj2.address);
		System.out.println("==========================");

	}

}
