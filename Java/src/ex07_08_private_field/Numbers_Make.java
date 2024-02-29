package ex07_08_private_field;

public class Numbers_Make {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		Numbers b = new Numbers(arr);
		
		System.out.println(b.getTotal());
		System.out.println(b.getAverage());

	}
}