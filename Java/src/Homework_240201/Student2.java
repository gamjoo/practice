package Homework_240201;

import java.util.ArrayList;

public class Student2 {
	private String name;
	private int kor, eng, math;
	public static int korTotal;
	public static int engTotal;
	public static int mathTotal;

	int getTotal() {
		return kor+eng+math;
		// 채우기
	}

	float getAverage() {
		return (Math.round((getTotal()/3.0)*10)/10f);
		// 채우기
	}

	public Student2(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

		korTotal += kor;
		engTotal += eng;
		mathTotal += math;
	}

	// 학생별 총점을 기준으로 정렬하기
	static void sort(ArrayList<Student2> list) {
		for (int i=0; i<list.size()-1; i++) {
			for (int j=i+1; j<list.size(); j++) {
				Student2 a = list.get(i);
				Student2 b = list.get(j);
				if(a.getTotal() < b.getTotal()) {
						list.set(i, b);
						list.set(j, a);
				}
			}
		}
		// 채우기
	}

	public String toString() {
		return this.name
				+"\t"+this.kor
				+"\t"+this.eng
				+"\t"+this.math
				+"\t"+this.getTotal()
				+"\t"+this.getAverage();
		// 채우기
	}

}
