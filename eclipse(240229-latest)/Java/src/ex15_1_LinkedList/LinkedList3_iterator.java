package ex15_1_LinkedList;

import java.util.*;

public class LinkedList3_iterator {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("망고");
		list.add("파인애플");
		list.add("바나나");
		
		//iterator()메소드를 호출하여 Iterator 객체를 얻는다.
		Iterator<String> iterator = list.iterator();
		
		//Iterator 객체를 이용하여 list에 있는 데이터를 순서대로 가져와서 출력
		while (iterator.hasNext()) {//현재 위치에서 다음 데이터가 있는지 확인하는 메소드
			String str = iterator.next(); //다음 데이터를 가져오는 메소드
			System.out.println(str);
		}
	}
}
