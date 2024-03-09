	
package ex06_1_array_main;

public class Homework_240102_Sort_Answer {
	public static void main(String[] args) {
		int a[] = { 5, 4, 3, 2, 1 };

		// 웬만하면 length 이용해서 문장만들고 반복문 돌리기 
		
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) { // 초기값, 변하는 값, 최종값
				if (a[i] > a[j]) {
					int imsi = a[i];
					a[i] = a[j];
					a[j] = imsi;
				}
			}
		}

		System.out.println("정렬 후 데이터 : ");
		
		//향상된 for문을 활용하면 정렬값을 촤라락 출력할 수 있다
		for (int data : a) {
			System.out.print(data + "\t");
		}
	}

}
