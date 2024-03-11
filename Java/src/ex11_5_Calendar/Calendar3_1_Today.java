package ex11_5_Calendar;


import java.util.GregorianCalendar;

public class Calendar3_1_Today {
	public static void main(String[] args) {
		System.out.println("===== 오늘의 날짜 =====");
		Today t = new Today();
		System.out.println(t.toString());
		System.out.println(t);
		//참조변수만 입력해서 출력하면 내부적으로 toString을 호출한다!!! 기억해야 한다..
		
		System.out.println("===== 특정 날짜 =====");
		GregorianCalendar a = new GregorianCalendar(2024,6,1);
		Today k = new Today(a);
		System.out.println(k);
		System.out.println(k.toString());
		//k로만 입력하면, k.toString() 메소드를 내부적으로 자동 호출한다
		
		//변수 생성없이 바로 객체생성해서 넣어줘도 된다
		System.out.println("===== 특정 날짜 =====");
		Today t3 = new Today(new GregorianCalendar(2024,6,1));
		System.out.println(t3.toString());
		System.out.println(t3);
		
	}

}
