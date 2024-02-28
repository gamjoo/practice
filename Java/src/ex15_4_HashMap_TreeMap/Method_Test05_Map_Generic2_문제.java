package ex15_4_HashMap_TreeMap;

import java.util.HashMap;
import java.util.Scanner;

public class Method_Test05_Map_Generic2_문제 {
	
	static HashMap<String, Integer> max_min(int data[]) {
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		
		int result[] = {data[0], data[0]};

		for (int i=1; i<data.length; i++) {
		if(result[0] < data[i]) result[0] = data[i]; //max
		if(result[1] > data[i]) result[1] = data[i]; //min
		}
		
		m.put("최댓값", result[0]);
		m.put("최솟값", result[1]);
		return m;
		
//		int max = data[0], min=data[0];
//		for (int i=1; i<data.length; i++) {
//			if (max < data[i])
//				max = data[i];
//			if (min > data[i])
//				min = data[i];
//		}
		
//		m.put("최댓값", max);
//		m.put("최솟값", min);

	}
	
	public static void main(String args[]) {
		int data[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요?");
		for(int i=0; i<data.length; i++) 
			data[i] = sc.nextInt();
		
		HashMap<String, Integer> m = max_min(data);
		System.out.println("최댓값 = " + m.get("최댓값"));
		System.out.println("최솟값 = " + m.get("최솟값"));
		
		sc.close();
	}

}
