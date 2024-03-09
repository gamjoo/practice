package ex07_01_object;

public class GoodsStock {	//클래스의 선언을 시작하는 키워드 : class
	
	String goodsCode;	//상품코드
	int stockNum;		//재고수량
	/*
	 * 1. 생성자
	 * 	(1) 인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드'
	 		따라서 인스턴스 변수의 초기화 작업에 주로 사용되며 인스턴스 생성시에
	 		실행되어야 할 작업을 위해서도 사용된다.
	 	(2) 생성자도 오버로딩이 가능하여 여러 개의 생성자가 존재할 수 있다.
	   2. 생성자 조건
	   	(1) 생성자의 이름은 클래스의 이름과 같아야 한다.
	   	(2) 생성자의 리턴 타입이 없어야 한다.
	 */
	
	 /* 매개변수가 없는 생성자 - 기본 생성자
	  	(1) 클래스에는 반드시 하나 이상의 생성자가 정의되어 있어야 함
	  	(2) 생성자가 없는 경우 자동으로 추가되는 생성자
	  	(3) 매개변수가 있는 생성자가 한개라도 작성된 경우 자동 추가 안 됨
	   
	  */
	GoodsStock(){
		
	}
	
	void addStock(int num) {
		stockNum += num;	
	}
	
	int subtractStock(int num2) {
		if(num2 > stockNum) {
			return 0;
		} else {
		//	return stockNum-num2;
			stockNum -= num2;
			return num2; //return문을 만나면 method 종료
		}
	}

}
