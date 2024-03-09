package ex15_1_ArrayList;
import java.util.ArrayList;
public class ArrayList_Contains_Remove {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("봄");
		list1.add("여름");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("봄");
		list2.add("봄");
		list2.add("여름");
		list2.add("가을");
		list2.add("겨울");
		
		
		for (String s : list1)
			
		for (int i=0; i<list2.size(); i++)	
			if (list2.contains(s)) {
				list2.remove(i--);
			}

//		for(int i=0; i<list2.size(); i++) {
//			if(list1.contains(list2.get(i))) {
//				list2.remove(i);
//				list2.remove(i--);
//			}
//		}

		System.out.println(list1);
		System.out.println(list2);
	}
}


