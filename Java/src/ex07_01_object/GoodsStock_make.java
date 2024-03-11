package ex07_01_object;

public class GoodsStock_make {
	public static void main(String args[]) {
		// GoodsStock obj;				//변수 선언
		// obj = new GoodsStock();		//객체 생성
		GoodsStock obj = new GoodsStock();
		
		obj.goodsCode = "52135";
		obj.stockNum = 200;
		System.out.println("상품코드:" + obj.goodsCode);
		System.out.println("재고수량:" + obj.stockNum);
		
		System.out.println("=====obj.addStock(1000); 후=====");
		obj.addStock(1000);	//메서드 호출
		System.out.println("상품코드:" + obj.goodsCode);
		System.out.println("재고수량:" + obj.stockNum);
		
		System.out.println("=====obj.subtractStock(500); 후=====");
		obj.subtractStock(500);
		System.out.println("상품코드:" + obj.goodsCode);
		System.out.println("재고수량:" + obj.stockNum);
		

		
		
	}

}
