package ex11_3_StringTokenizer;
import java.util.StringTokenizer;
public class StringTokenizerExample5 {
	public static void main(String[] args) {
		// true:구분자도 토큰으로 추출하도록 만드는 인자
		StringTokenizer stok = new StringTokenizer("사과=10|초콜릿=3|샴페인=1", "=|", true);

		while (stok.hasMoreTokens()) {// 토큰이 있는 동안 반복하는 메소드
			String str = stok.nextToken();
			System.out.println(str);
		}
	}
}
