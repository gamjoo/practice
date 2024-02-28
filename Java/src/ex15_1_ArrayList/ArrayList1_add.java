package ex15_1_ArrayList;
import java.util.ArrayList;
public class ArrayList1_add {
	public static void main(String[] args) {
		//업캐스팅 (상속해준 메소드-부모메소드만 사용가능하다)
		//List list = new ArrayList;
		
		ArrayList list = new ArrayList();
		list.add("하나");
		list.add(2);		//list.add(Integer.valueOf(2));
		list.add(false);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add('A');
	}

}
