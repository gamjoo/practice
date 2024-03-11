package ex15_5_HashSet;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSet_Lotto {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
				
		while(set.size()<6) {
			int num = (int)(Math.random() * 45 + 1);
			set.add(num);
		}
		System.out.print(set);
		
		//TreeSet을 배열로 변환
		Integer[] array = set.toArray(new Integer[set.size()]);
		
		//배열 출력
		System.out.println(Arrays.toString(array));
	}
}
