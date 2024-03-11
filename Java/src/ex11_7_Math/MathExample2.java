//0이상 1미만의 난수 발생 프로그램
package ex11_7_Math;

public class MathExample2 {
	public static void main(String[] args) {
//		System.out.println(Math.random()); // 0<=난수 < 1:double 형
//		System.out.println(Math.random());
//		System.out.println(Math.random());

//		int num;
		/*
		 * 0부터 9까지의 정수 범위에 속하는 난수를 만들기 1. 0<= 난수 < 1 2. 0<= 난수*10 < 10 3. 0<=
		 * (int)(난수*10) < 10 ==>0이상 10미만 정수로 만들기
		 */

		// 공식 : (정수화)((상한값 - 하한값 + 1)*난수 + 하한값)
		// (int)((9-0+1)*난수 + 0)
//		num = (int) (Math.random() * 10);
//		System.out.println(num);

		// 1부터 45까지 정수 범위에 속하는 난수 만들기
		// (int)((45-1+1)*난수 +1)

		int num[] = new int[6];		//중복된 데이터 확인하고자 배열 사용한다.
		
		for (int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*45 +1);
			
			for (int j=0; j<i; j++) {
				if(num[i] == num[j]) {
					i--;				//완전 핵심 논리.. 중복되면 하나줄여주고 다시 반복
					break;
				}
			}//j for end
		}//i for end
		
		for(int a : num)
			System.out.print(a+"\t");
		
		System.out.println("\n=====================정렬 후==================");
		for(int i=0; i<num.length-1; i++) {
			for(int j=i+1;j<num.length; j++) {
				if(num[i]>num[j]) {
					int imsi = num[i];
					num[i] = num[j];
					num[j] = imsi;
				}
			}
		}
		
		for(int a : num)
			System.out.print(a+"\t");

//		for (int i = 0; i < 6; i++) {
//			num = (int) (Math.random() * 45 + 1);
//			a[0] = num;
//			for (int k = 0; k < i; k++) {
//				if (a[i] != a[k])
//					a[i] = num;
//				else
//					k--;
//					break;
//			}
//
//
//			System.out.print(a[i] + "\t");
//		}
	}
}

//6개 인트형 배열
//반복 : 난수발생 6번, 비교하는 작업(0일때 0번 돌고, 1일때 0을보고, 2때 0과1을 보고,3때 0,1,2
//비교해서 같으면 다시 구해야 한다. continue
//마지막으로 순서대로 정렬
