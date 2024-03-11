package ex06_1_array;

public class TwoArrayForExample2_String {
	public static void main(String[] args) {
		String arr[][] = { {"과일", "사과"},
				           {"아이스크림", "메로나"},
				           {"커피"}};
		
		// 향상된 for문
		for (String n : arr[0]) {
			System.out.println(n);
		}

////////////////////////////////////////////////////////////
		System.out.println("==========배열된 순서대로 출력하기==========");
		
		for (String[] a : arr) {
			for (String b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}

}
