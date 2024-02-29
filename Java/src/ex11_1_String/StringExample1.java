package ex11_1_String;
public class StringExample1 {
	public static void main(String[] args) {
		String str = "집에 가고 싶어요.";
		int len = str.length(); // length 메소드 호출

	for (int cnt=0; cnt<len; cnt++) {
		char ch = str.charAt(cnt);
		System.out.println("index = " + cnt + " 문자 = " + ch);
		}
	}
}