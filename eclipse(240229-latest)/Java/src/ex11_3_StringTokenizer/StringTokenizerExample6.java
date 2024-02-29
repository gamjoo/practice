package ex11_3_StringTokenizer;

import java.util.StringTokenizer;
import java.lang.String;

public class StringTokenizerExample6 {
	public static void main(String[] args) {
		String phone = "010-1234-5678";

		StringTokenizer boonlee1 = new StringTokenizer(phone, "-");
		while(boonlee1.hasMoreTokens())
			System.out.println(boonlee1.nextToken());

		String[] boonlee2 = phone.split("-");
		
		for (int i=0; i<boonlee2.length; i++) {
			System.out.println(boonlee2[i]);
		}
		
		for (String s : boonlee2) {
			System.out.println(s);
		}

	}
}
