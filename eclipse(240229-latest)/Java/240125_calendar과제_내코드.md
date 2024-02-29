```java
package Homework_package;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Homework_240125 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 년도를 입력하세요>");
		int su1 = sc.nextInt();
		System.out.print("출력할 달을 입력하세요>");
		int su2 = sc.nextInt();

		print(su1, su2);

		sc.close();

	}

	static void print(int su1, int su2) {
		Calendar Input = new GregorianCalendar(su1, su2 - 1, 1);
		System.out.println(Input.get(Calendar.DAY_OF_WEEK));
		System.out.println(Input.getActualMaximum(Calendar.DATE));
		System.out.printf("\t\t%d년  %d월\n", su1, su2);
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "일", "월", "화", "수", "목", "금", "토");
		for (int i = 0; i < 50; i++) {
			System.out.print("=");
		}
		System.out.println();

		int su3 = Input.get(Calendar.DAY_OF_WEEK);
		int su4 = Input.getActualMaximum(Calendar.DATE);

		int i = -(su3 - 1);
		while (++i <= su4) {
			if (i <= 0) {
				System.out.printf("\t%s", "");
			} else {
				System.out.printf("%d\t", i);
				if (i % 7 == -(su3 - 1) + 7)
					System.out.println();
			}
		}

	}

}
```
###### ★시작요일이 일요일인 경우를 해결못했음