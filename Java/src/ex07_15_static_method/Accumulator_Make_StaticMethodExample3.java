//정적 필드가 있는 클래스
//total 필드는 객체마다 따로 생기지만
//grandTotal 필드는 특정 객체에 상관없이 클래스 자체에 생기는 정적 필드이다.

package ex07_15_static_method;

class Accumulator_Make_StaticMethodExample3 {
	public static void main(String[] args) {
		int grandTotal = Accumulator.getGrandTotal();
		System.out.println("총계 = " + grandTotal);
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();
		obj1.accumulate(10); //total = 10, grandTotal = 10
		obj2.accumulate(20); //total = 30, grandTotal = 30

		//정적 메서드 호출문
		grandTotal = Accumulator.getGrandTotal();
		
		//인스턴스 메서드 print()를 정적 메서드인 main()에서 호출할 수 없다.
		//print 메서드를 활용하기 위해서 어떻게 해야할까?
		/*print 메서드는 인스턴스 메서드다. 인스턴스 메서드를 활용하려면
		  객체를 생성해야 한다. print 메서드는 어느 class에 있나? */
		
		Accumulator_Make_StaticMethodExample3 Solve = new Accumulator_Make_StaticMethodExample3();	
		Solve.print(obj1);
		Solve.print(obj2);
		System.out.println("총계 = " + grandTotal);
	}//main() end
	
	void print(Accumulator a) {
		System.out.println("total = " + a.total);
	}//print() end
	
}