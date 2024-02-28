package ex05_3_while;

public class WhileExcercise {
	public static void main(String[] args) {

		int sum, i;
		sum = 0;
		i = 1;
		while (i <= 10) {
			sum = sum + i;
			i = i + 1;	
		}
		
		System.out.println(sum);
		
		int sum2, i2;
		sum2 = 0;
		i2 = -1;
		while (i2 <= 7) {
			i2 = i2 + 2;
			sum2 = sum2 + i2;
		}
		
		System.out.println(sum2);
		
		int sum3, i3;
		sum3 = 0;
		i3 = 0;
		while (i3 <= 8) {
			i3 = i3 + 2;
			sum3 = sum3 + i3;
			
		}
		
		System.out.println(sum3);
		
	}

}
