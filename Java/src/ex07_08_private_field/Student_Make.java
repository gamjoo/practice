package ex07_08_private_field;

public class Student_Make {
	public static void main(String[] args) {

		Student a = new Student("강호동", 85, 60, 70);
		Student b = new Student("이승기", 90, 95, 80);
		Student c = new Student("유재석", 75, 80, 100);
		Student d = new Student("하하", 80, 70, 95);
		Student e = new Student("이광수", 100, 65, 80);

		///////////////////////////////////////////

		System.out.println("=========== 학생별  /  과목별 총점구하기 ===========");
		String[] R2 = { "이름", "국어", "수학", "영어", "총점", "평균" };
		for (int i = 0; i < R2.length; i++) {
			System.out.printf("%s\t", R2[i]);
		}

		//////////////////////////////////////////////
		System.out.println();
		print(a);
		print(b);
		print(c);
		print(d);
		print(e);

		/////////////////////////////////////////////

		for (int i = 1; i < 48; i++) {
			System.out.print("=");
		}

		/////////////////////////////////////////////
		int korhpa1 = korhap(a) + korhap(b) + korhap(c) + korhap(d) + korhap(e);
		int enghap1 = enghap(a) + enghap(b) + enghap(c) + enghap(d) + enghap(e);
		int mathhap1 = mathhap(a) + mathhap(b) + mathhap(c) + mathhap(d) + mathhap(e);

		System.out.println();
		System.out.print("총점" + "\t");
		System.out.printf("%d\t%d\t%d\t", korhpa1, enghap1, mathhap1);
		//////////////////////////////////////////////

	}

	static void print(Student abs) {
		System.out.printf(abs.name + "\t");
		System.out.printf(abs.kor + "\t");
		System.out.printf(abs.eng + "\t");
		System.out.printf(abs.math + "\t");
		System.out.printf(abs.getTotal() + "\t");
		System.out.printf("%.1f\t", abs.getAverage());
		System.out.println();
	}

	static int korhap(Student hap) {
		return hap.kor;
	}

	static int enghap(Student hap) {
		return hap.eng;
	}

	static int mathhap(Student hap) {
		return hap.math;
	}

}
