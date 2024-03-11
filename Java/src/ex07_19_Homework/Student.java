package ex07_19_Homework;

public class Student {
	String name;
	int kor, eng, math;
	static int korTotal, mathTotal, engTotal; //static이 붙은 이 변수는 각 인스턴스의 공통된 속성들 

	//여기서 생성자의 기능은 필드값을 초기화
	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		korTotal+=kor;
		engTotal+=eng;
		mathTotal+=math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (getTotal() / 3f);
	}

}