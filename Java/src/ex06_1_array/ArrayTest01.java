package ex06_1_array;

public class ArrayTest01 {
	public static void main(String[] args) {
		//이전 내용이 출력되면 main 메서드가 잘못 입력된 것임
		
		int sum=0;
		
		int[] score = {95,70,80,75,100};
		for (int i=0; i<score.length; i++) {
			System.out.println("score["+i+"]="+score[i]);
//			sum = sum + score[i];
			sum += score[i];	//더하고 대입!!
		}
		
		System.out.println("총점="+sum);
	}

}
