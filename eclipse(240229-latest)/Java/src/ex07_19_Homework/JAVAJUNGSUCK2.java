package ex07_19_Homework;

public class JAVAJUNGSUCK2 {
	public static void main(String[] args) {

		int[][] arr = { 
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		
		int total = 0;
		float average = 0;
		
		int cnt = 0;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				total += arr[i][j];
				cnt++;
			}
		} 
		average = (float)total / cnt; 
		

		System.out.println("total="+total);
		System.out.println("average="+average);
		
	} // end of main

} // end of class
