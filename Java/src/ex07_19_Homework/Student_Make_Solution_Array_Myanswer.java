//method를 만드는 기준은 반복되는 작업이라는 것

package ex07_19_Homework;

public class Student_Make_Solution_Array_Myanswer {
	public static void main(String[] args) {

		Student[] students = { new Student("강호동", 85, 60, 70), new Student("이승기", 90, 95, 80),
				new Student("유재석", 75, 80, 100), new Student("하하", 80, 70, 95), new Student("이광수", 100, 65, 80) };

		printStudent(students);

	}

	private static void printStudent(Student[] students) {

		System.out.println("========= 학생별   /   과목별 총점 구하기 =========");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

		for (Student obj : students) {
			printInfo(obj);
		}

		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}

		System.out.println();
		System.out.printf("%s\t%d\t%d\t%d\t", "총점", Student.korTotal, Student.engTotal, Student.mathTotal);

	}

	static void printInfo(Student student) {
		System.out.print(student.name + "\t" + student.kor + "\t" + student.eng + "\t" + student.math + "\t"
				+ student.getTotal() + "\t");
		System.out.printf("%.1f\n", student.getAverage());
	}

}