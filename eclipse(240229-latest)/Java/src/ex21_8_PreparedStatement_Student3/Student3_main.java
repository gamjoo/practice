package ex21_8_PreparedStatement_Student3;

import java.util.Scanner;
import java.util.*;

public class Student3_main {
	
	static String[] menus = {"입력","조회","수정","삭제","모두조회","종료"};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		DAO dao = new DAO();

		do {
			int menu = menuselect(sc);
			switch (menu) {
			case 1:
				insert(sc, dao);
				break;
			case 2:
				select(sc, dao);
				break;
			case 3:
				update(sc, dao);
				break;
			case 4:
				delete(sc, dao);
				break;
			case 5:
				selectAll(dao);
				break;
			case 6:
			     sc.close();
				 return;
			}
		} while (true);
	}
	
	private static void insert(Scanner sc, DAO dao) {
		System.out.print("이름을 입력하세요>");
		String name = sc.nextLine();
		
		System.out.print("국어점수를 입력하세요>");
		int kor = inputNumber(sc,0,100);
		
		System.out.print("수학점수를 입력하세요>");
		int math = inputNumber(sc,0,100);
		
		System.out.print("영어점수를 입력하세요>");
		int eng = inputNumber(sc,0,100);
		
		Student3 student3 = new Student3(name,kor,math,eng);
		
		
		int result = dao.insert(student3);
		if (result == 1)
			System.out.println("삽입 되었습니다.......");
		else 
			System.out.println("삽입 실패되었습니다.");
	}
	
	private static void select(Scanner sc, DAO dao) {
		
		System.out.print("조회할 번호를 입력하세요>");
		int num = inputNumber(sc);
		Student3 st = dao.select(num);
		if (st != null) {
			System.out.println("번호\t이름\t국어\t수학\t영어\t총점\t평균\t학점");
			System.out.println(st.toString());
		}
		else {
			System.out.println("해당 번호로 조회된 학생이 없습니다.");
		}
		
	}

	private static void selectAll(DAO dao) {
		ArrayList<Student3> list = dao.selectAll();
		if (list.isEmpty())
			System.out.println("테이블에 데이터가 없습니다.");
		else {
			System.out.println("번호\t이름\t국어\t수학\t영어\t총점\t평균\t학점");
			for (Student3 student : list) {
				System.out.println(student.toString());
			}
		}
	}

	private static void delete(Scanner sc, DAO dao) {
		System.out.print("삭제할 번호를 입력하세요>");
		int num = inputNumber(sc);
		
		if (isExist(num,dao)) {
			if (dao.delete(num)==1) {
				System.out.println("삭제 되었습니다.");
			} else {
				System.out.println("삭제 되지 않았습니다.");
			}
		} else {
			System.out.println("테이블에 없는 번호 입니다.");
		}
	}

	private static void update(Scanner sc, DAO dao) {
		System.out.print("수정할 번호를 입력하세요>");
		int num = inputNumber(sc);
		Student3 student = null;
		
		if (isExist(num,dao)) {
	
			System.out.print("이름을 입력하세요>");
			String name = sc.nextLine();
			
			System.out.print("국어점수를 입력하세요>");
			int kor = inputNumber(sc,0,100);
			
			System.out.print("수학점수를 입력하세요>");
			int math = inputNumber(sc,0,100);
			
			System.out.print("영어점수를 입력하세요>");
			int eng = inputNumber(sc,0,100);
			
			student = new Student3(name, kor, math, eng);
			
			student.setNo(num);
			
			if (dao.update(student)==1)
				System.out.println("수정이 되었습니다.");
			else
				System.out.println("수정 중 오류 발생했습니다.");
			
		} else {
			System.out.println("테이블에 없는 번호입니다.");
		}
		
	}
	
	private static boolean isExist(int num, DAO dao) {
		if (dao.select(num)!=null) {
			return true;
		} else {
			return false;
		}
	}
	



	private static int menuselect(Scanner sc) {
		int i=0;
		System.out.println("===================================");
		for (String m : menus) {
			System.out.println(++i + "." + m);
		}
		
		System.out.println("===================================");
		System.out.print("메뉴를 선택하세요>");
		return inputNumber(sc,1,menus.length);
	}
	
	private static int inputNumber(Scanner sc, int start, int end) {
		int input = 0;
		while (true)
			try {
				input = Integer.parseInt(sc.nextLine());
				if ((input <= end && input >= start) || (start==0 && end==0)) {
					break;
				} else {
					System.out.print(start + "~" + end + "사이의 숫자를 입력하세요>");
				}
			} catch (NumberFormatException e) {
				System.out.print("숫자로 입력하세요>");
			}
		return input;
	}
	
	private static int inputNumber(Scanner sc) {
		return inputNumber(sc, 0, 0);
	}
	

}