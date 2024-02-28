package ex04_13_comAssign;

public class CompAssignmentExample1 {
	public static void main(String args[]) {
		int res=10, a=2;
		res += a; //res = res + a;
		System.out.println(res); //10+2=12
		
		res -= a; //res = res - a
		System.out.println(res); //12-2=10
		
		res *= a; //res = res*a
		System.out.println(res); //10*2=20
		
		res /= a; //res = res/a
		System.out.println(res); //20/2=10
		
		int num = 29;
		num -= 2 + 3 * 4; // num = num - (2 + 3 * 4) 와 같은 결과
		System.out.println(num);
	}

}
