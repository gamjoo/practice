/*1. 클래스 이름 : SubscriberInfo
   필드 : String name(이름), id(아이디), password(비밀번호); 
         String phoneNo(전화번호), address(주소);    
        
   생성자
     : 매개변수 3개
              필드 String name(이름), id(아이디), password(비밀번호)를 
               매개변수의 값으로 필드 초기화
               
     : 매개변수 5개
              필드 String name(이름), id(아이디), password(비밀번호),
                 String phoneNo(전화번호), address(주소); 를 
               매개변수의 값으로 필드 초기화               
     
   메서드: 반환형은 없습니다. 
     하나)이름 : changePassword
         매개변수 : String
         기능 : 필드 password의 값을 매개변수의 값으로 변경합니다.
      
     둘)이름 : setPhoneNo
       매개변수 : String
       기능 : 필드 phoneNo의 값을 매개변수의 값으로  변경합니다.

     셋)이름 : setAddress
        매개변수 : String
       기능 : 필드 address의 값을 매개변수의 값으로 변경합니다.
*/

package ex07_03_two_constructor;

public class SubscriberInfo {
	String name;
	String id;
	String password;
	String phoneNo;
	String address;
	
	SubscriberInfo(String name, String id, String password) {
		
		this.name = name;
		this.id = id;
		this.password = password;
		
	}
	
	SubscriberInfo(String name,String id,String password,String phoneNo,String address){
		
		this.name = name;
		this.id = id;
		this.password = password;
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
