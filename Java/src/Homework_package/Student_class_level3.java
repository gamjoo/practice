package Homework_package;

public class Student_class_level3 {
	String name;
	int kor;
	int eng;
	int math;

	//여기서 생성자 역할은 필드값을 초기화
	Student_class_level3(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (getTotal() / 3f);
	}

}