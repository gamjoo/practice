//method를 만드는 기준은 반복되는 작업이라는 것

package ex07_19_Homework;

public class Student_Make_Solution_Array {
	public static void main(String[] args) {
		/*
		Student h1 = new Student("강호동", 85, 60, 70);
		Student h2 = new Student("이승기", 90, 95, 80);
		Student h3 = new Student("유재석", 75, 80, 100);
		Student h4 = new Student("하하", 80, 70, 95);
		Student h5 = new Student("이광수", 100, 65, 80);
		*/
		//int[] a = {1,2,3};
		
//		Student[] students = new Student[5];
//		students[0] = new Student("강호동",85,60,70);
//		students[1] = new Student("이승기", 90, 95, 80);
//		students[2] = new Student("유재석", 75, 80, 100);
//		students[3] = new Student("하하", 80, 70, 95);
//		students[4] = new Student("이광수", 100, 65, 80);
		
		
		Student[] students = { new Student("강호동", 85, 60, 70),
							   new Student("이승기", 90, 95, 80),
							   new Student("유재석", 75, 80, 100),
							   new Student("하하", 80, 70, 95),
							   new Student("이광수", 100, 65, 80) };
		
		
		int subject[] = getTotal(students);

		print(students, subject);
	
	}// main

	// 학생들의 과목 총점을 구하는 getTotla method 정의
	// 향상된 for문이 아니라, 그냥 for문으로 정의하면 어떤 형태가 될까?
	private static int[] getTotal(Student[] objs) {
		int[] subject = new int[3];
		for (Student obj : objs) { // objs배열을 가져와서 obj에 저장하는데 obj는 Student class의 참조변수
			subject[0] += obj.kor;
			subject[1] += obj.eng;
			subject[2] += obj.math;
		}
		return subject;
	}

	// print method를 호출하면 아래 작업을 수행한다
	static void print(Student[] objs, int[] subject) {
		System.out.println("========= 학생별   /   과목별 총점 구하기 =========");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

		for (Student obj : objs) {
			printInfo(obj);
		}

		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}
		System.out.print("\n총점\t");
		for (int i = 0; i < subject.length; i++)
			System.out.print(subject[i] + "\t");
	}

	// printInfo method를 호출하면 아래 작업을 수행한다.
	static void printInfo(Student student) {
		System.out.print(student.name + "\t" + student.kor + "\t" + student.eng + "\t" + student.math + "\t"
				+ student.getTotal() + "\t");
		System.out.printf("%.1f\n", student.getAverage());
	}
}
