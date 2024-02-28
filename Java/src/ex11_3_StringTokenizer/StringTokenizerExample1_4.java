package ex11_3_StringTokenizer;
import java.util.StringTokenizer;
public class StringTokenizerExample1_4 {
	public static void main(String[] args) {
		StringTokenizer stok = new StringTokenizer("사과 배 복숭아");

		while (stok.hasMoreTokens()) {// 토큰이 있는 동안 반복하는 메소드
			System.out.println(stok.nextToken());
		}
	}
}
