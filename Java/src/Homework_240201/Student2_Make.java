package Homework_240201;

import java.io.*;
import java.util.ArrayList;

public class Student2_Make {
	public static void main(String[] args) {
		
		input();
	}

static void input() {
	
	BufferedReader reader = null;
	String message = null;
	
	ArrayList<Student2> list = new ArrayList<Student2>();

	try {
		reader = new BufferedReader(new FileReader("jumsu.txt"));
		
		while ((message = reader.readLine()) != null) {
			String[] result = message.split(" ");
				list.add(new Student2(result[0], Integer.parseInt(result[1]), Integer.parseInt(result[2]), Integer.parseInt(result[3])));	
		}
		
	print(list);
		
	} catch (FileNotFoundException fnfe) {
		System.out.println("파일이 존재하지 않습니다.");
	} catch (IOException ioe) {
		System.out.println("파일을 읽을 수 없습니다.");
	} finally { //파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블록에서 사용.
		try {
			if(reader != null)
				reader.close();
		} catch (IOException e) { //close() 발생하는 예외 처리
			System.out.println("닫는 중 오류입니다.");
		}
	}	
}

static void print(ArrayList<Student2> list) {
	System.out.println("==========    학생별   /  과목별 총점구하기  ==========");
	System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

	for (Student2 s : list) {
		System.out.println(s.toString());
	}

	for (int j = 0; j < 50; j++) {
		System.out.print("=");
	}

	System.out.print("\n총점\t");
	System.out.print(Student2.korTotal + "\t");
	System.out.print(Student2.engTotal+ "\t");
	System.out.print(Student2.mathTotal + "\t");

}
}
