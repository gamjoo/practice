//정적 필드가 있는 클래스
//total 필드는 객체마다 따로 생기지만
//grandTotal 필드는 특정 객체에 상관없이 클래스 자체에 생기는 정적 필드이다.

package ex07_15_static_method;

class Accumulator_Make_StaticMethodExample1 {
	public static void main(String[] args) {
		//정적 메서드 호출문
		int grandTotal = Accumulator.getGrandTotal();
		System.out.println("총계 = " + grandTotal);
		
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();
		obj1.accumulate(10); //total = 10, grandTotal = 10
		obj2.accumulate(20); //total = 30, grandTotal = 30

		//정적 메서드 호출문
		grandTotal = Accumulator.getGrandTotal();
		System.out.println("obj1.total = "+obj1.total);
		System.out.println("obj2.total = "+obj2.total);
		System.out.println("총계 = " + grandTotal);
	
	}
}