package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayList5_add_set_remove {
	public static void main(String[] args) {
		// ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<String>();

		// list에 3개의 데이터 추가
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		pArrayList(list);
		
		//list에 2개의 데이터를 삽입
		list.add(2,"키위"); //인덱스2 위치에 삽입
		pArrayList(list);
		
		list.add(4,"키위");//인덱스4 위치에 삽입
		pArrayList(list);
		
		list.set(0,"오렌지");//인덱스0 위치에 데이터를 바꾼다.
		pArrayList(list);
		
		list.remove(1);//인덱스 1위치에 있는 데이터를 삭제한다.
		pArrayList(list);
		
		list.remove("키위");//list에서 "키위"라는 데이터를 찾아서 삭제한다.
		pArrayList(list);
		
	}
	
	static void pArrayList(ArrayList<String> list) {
		int num = list.size();
		for (int cnt=0; cnt<num; cnt++) {
		System.out.println("index="+cnt+" 데이터="+list.get(cnt));
		}
		
		System.out.println("==================");
		
	}
}