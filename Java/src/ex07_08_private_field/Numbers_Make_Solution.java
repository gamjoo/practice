package ex07_08_private_field;

public class Numbers_Make_Solution {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		Numbers obj = new Numbers(arr);
		print(obj);
	}
	
		// static 붙이지 않으면 메모리 영역에 올라가지 않음.
		// 
		static void print(Numbers obj) {
		System.out.println("합계 = " + obj.getTotal());
		System.out.println("평균 = " + obj.getAverage());

	}
}