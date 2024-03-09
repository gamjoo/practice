package ex11_3_StringTokenizer;
import java.util.StringTokenizer;
public class StringTokenizerExample3 {
	public static void main(String[] args) {
		// 구분자-콤마(,)와 수직선(|)
		StringTokenizer stok = new StringTokenizer("사과,배|복숭아", ",|");

		while (stok.hasMoreTokens()) {// 토큰이 있는 동안 반복하는 메소드
			String str = stok.nextToken();
			System.out.println(str);
		}
	}
}


