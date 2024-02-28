package Homework_240126;

public class StudentExample {
	public static void main(String args[]) {
		Student2 h1 = new Student2("강호동", 85, 60, 70);
		Student2 h2 = new Student2("이승기", 90, 95, 80);
		Student2 h3 = new Student2("유재석", 75, 80, 100);
		Student2 h4 = new Student2("하하", 80, 70, 95);
		Student2 h5 = new Student2("이광수", 100, 65, 80);
		Student2 hs[] = { h1, h2, h3, h4, h5};
		Student2.sort(hs);
		print(hs);
	}
	private static void print(Student2[] hs) {
		// 출력하기
		System.out.println("===============   학생별   /  과목별 총점구하기  ==========");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < hs.length; i++) {
			System.out.println(hs[i].toString());
		}

		for (int j = 0; j < 51; j++) {
			System.out.print("=");
		}

		System.out.print("\n총점\t");
			System.out.print(Student2.korTotal + "\t");
			System.out.print(Student2.engTotal + "\t");
			System.out.print(Student2.mathTotal + "\n");
	}
	    
}