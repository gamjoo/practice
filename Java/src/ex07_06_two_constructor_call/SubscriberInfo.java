//생성자에서 생성자를 호출하는 예시

package ex07_06_two_constructor_call;

public class SubscriberInfo {
	String name;
	String id;
	String password;
	String phoneNo;
	String address;
	
	//this는 참조변수로 인스턴스 자신을 가리킴.
	SubscriberInfo(String name, String id, String password) {
		
		this.name = name;
		this.id = id;
		this.password = password;
		
	}
	
	SubscriberInfo(String name,String id,String password,String phoneNo,String address){
		//this() : 같은 클래스의 다른 생성자를 호출할 때 사용
		//this. : this()과 다름.
		//String 타입의 파라미트 3개를 갖는 생성자를 호출
		this(name, id, password);
		//Constructor call must be the first statement in a constructor
		//this()로 생성자를 호출할 때는 첫번째 줄에 반드시 작성해야 함
		this.phoneNo = phoneNo;
		this.address = address;
		
	}
	
	void changePassword(String password) {
		this.password = password;
	}
	
	void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	void setAddress(String address) {
		this.address = address;
	}

}
