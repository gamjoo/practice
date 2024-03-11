package ex14_1_Wrapper;

public class Wrapper4_valueOf {
	public static void main(String[] args) {
	Integer obj1 = Integer.valueOf(10);
	Integer obj2 = Integer.valueOf(10);
	
	//똑같은 기본값을 가지고 valueOf메소드를 여러 번 호출하면 같은 객체에 대한 참조값이 리턴된다.
	//가리키는 주소가 동일하므로, obj1==obj2
	if(obj1==obj2)
		System.out.println("obj1==obj2");
	else
		System.out.println("obj1!=obj2");
	
	//String과 마찬가지로 equals메소드는 주소값이 아닌 내용을 비교하도록 '자동으로' 오버라이딩되어 있다.
	if(obj1.equals(obj2))
		System.out.println("obj1.equals(obj2) 같아요");
	else
		System.out.println("obj1.equals(obj2) 달라요");
	
}
}