package test;

public class ScopeEx {

	public static void main(String[] args) {
		int a = 10;
		
		if (1==1) {
			a = 20;
			int b = 10;
		}

		a = 30;		
	}

}
