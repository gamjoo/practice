//증가 연산자, 감소 연산자
package ex04_09_incre_dec;

public class IncrDec1 {
	public static void main(String[] args) {
		int num = 0;
		num = num + 1;
		System.out.println(num); //1
		
		num = num - 1; //1-1
		System.out.println(num); //0
		
		num++; // num = num + 1;
		System.out.println(num); //1
		++num; // num = num + 1;
		System.out.println(num); //2
		
		num--; // num = num - 1;
		System.out.println(num); //1
		--num; // num = num -1;
		System.out.println(num); //0
	}

}
