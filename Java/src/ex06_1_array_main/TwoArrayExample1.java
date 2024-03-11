package ex06_1_array_main;

public class TwoArrayExample1 {
	public static void main(String[] args) {
		int table[][] = new int[3][4]; //3행 4열의 크기로 생성
		
		table[0][0] = 10;
		table[1][1] = 20;
		table[2][3] = table[0][0] + table[1][1];
		
		System.out.println(table[0][0]);
		System.out.println(table[1][1]);
		System.out.println(table[2][3]);
		
		//System.out.println("table[3][4] = " + table[3][4]);
		//인덱스는 0부터 시작하는 것에 항상 주의!!
		
		System.out.println("table[0][0] = " + table[0][0]);
		System.out.println("table[0][1] = " + table[0][1]);
		System.out.println("table[0][2] = " + table[0][2]);
		System.out.println("table[0][3] = " + table[0][3]);
		System.out.println("table[1][0] = " + table[1][0]);
		System.out.println("table[1][1] = " + table[1][1]);
		System.out.println("table[1][2] = " + table[1][2]);
		System.out.println("table[1][3] = " + table[1][3]);
		System.out.println("table[2][0] = " + table[2][0]);
		System.out.println("table[2][1] = " + table[2][1]);
		System.out.println("table[2][2] = " + table[2][2]);
		System.out.println("table[2][3] = " + table[2][3]);
	
		/////////////////////////////////////////////////////////////
		
//		System.out.println("============반복문으로===============");
//		for (int i=0; i<=2; i++) {
//			for (int j=0; j<=3; j++) {
//				System.out.println("table["+i+"]["+j+"] = "+table[i][j]);
//			}
//		}
		
		/////////////////////////////////////////////////////////////
		
		for (int j=0; j<=table.length; j++) {
			for (int i=0; i<table[j].length; i++) {
				System.out.println("table["+j+"]["+i+"] = "+table[j][i]);
			}
		}		
	}

}
