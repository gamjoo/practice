package ex11_3_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample4 {
	public static void main(String[] args) {
		// true:구분자도 토큰으로 추출하도록 만드는 인자
		StringTokenizer stok = new StringTokenizer("사과=10|초콜릿=3|샴페인=1", "=|", true);
		System.out.println("상품이름\t상품 수");

		//=을 만나면 1탭 |를 만나면 줄바꿈 아이디어
		while (stok.hasMoreTokens()) {
			String token = stok.nextToken();
			if (token.equals("=")) {
				System.out.print("\t");
			} else if (token.equals("|")) {
				System.out.print("\n");
			} else {
				System.out.print(token);
			}
		}
		
//		while (stok.hasMoreTokens()) {// 토큰이 있는 동안 반복하는 메소드
//			String str = stok.nextToken();
//			if (str.equals("=") || str.equals("|")) {
//				continue;
//			}
//			System.out.printf("%s\t", str);
//
//			if (str.equals("10") || str.equals("3") || str.equals("1")) {
//				System.out.println();
//			}
//		}
	}
}
