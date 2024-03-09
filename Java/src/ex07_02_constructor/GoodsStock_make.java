package ex07_02_constructor;

public class GoodsStock_make {
	public static void main(String args[]) {
		GoodsStock obj = new GoodsStock("52135", 200);
		print(obj); // 여기서의 obj는 인자. 밑에서 parameter obj와 다름

		obj.addStock(1000); // 메서드 호출
		System.out.println("=====obj.addStock(1000); 후=====");
		print(obj);

		obj.subtractStock(500);
		System.out.println("=====obj.subtractStock(500); 후=====");
		print(obj);

	}

	// 매서드명칭 (자료형 파라미터)
	private static void print(GoodsStock a) {
		System.out.println("상품코드:" + a.goodsCode);
		System.out.println("재고수량:" + a.stockNum);

	}

}
