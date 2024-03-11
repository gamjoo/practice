package ex15_1_LinkedList;
import java.util.LinkedList;
public class LinkedList2_set_remove {
	public static void main(String[] args) {
		//LinkedList 객체를 생성
		LinkedList<String> list = new LinkedList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2, "키위");
		pLinkedList(list);
		
		list.set(0,"오렌지");
		pLinkedList(list);
		
		list.remove(1);
		pLinkedList(list);

		list.remove("키위");
		pLinkedList(list);
	}
	
	private static void pLinkedList(LinkedList<String> list) {
		int num = list.size();
		System.out.println("=======================");
		for (int i=0; i<num; i++) {
			System.out.println("index="+i+" 데이터="+list.get(i));
		}
	}
}
