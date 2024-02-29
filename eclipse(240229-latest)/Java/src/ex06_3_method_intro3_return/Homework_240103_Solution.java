//240103 숙제 보완

package ex06_3_method_intro3_return;

public class Homework_240103_Solution {
	public static void main(String[] args) {
		String name[] = { "강호동", "이승기", "유재석", "하하", "이광수" };
		String sub_name[] = { "국어", "수학", "영어" };

		int[][] score = { { 85, 60, 70 }, // 0행(1번학생)
				{ 90, 95, 80 }, // 1행(2번학생)
				{ 75, 80, 100 }, // 2행(3번학생)
				{ 80, 70, 95 }, // 3행(4번학생)
				{ 100, 65, 80 } // 4행(5번학생)
		};

		int[] subject = new int[3]; // 과목총점 저장
		int[] student = new int[5]; // 학생의 총점 저장

		System.out.println("=========== 학생별  /  과목별 총점구하기 ===========");

		String[] R2 = { "국어", "수학", "영어", "총점", "평균" };
		for (int i = 0; i < R2.length; i++) {
			System.out.printf("%s\t", R2[i]);
		}

		System.out.println();

		///////////////////// 학생의 총점//////////////////////
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++)
				student[i] += score[i][j];
		}

		/////////////////// 표 채우기////////////////////////
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%s\t", name[i]); // 정렬할때 \t으로 하면 간격 잘 맞음

			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%s\t", score[i][j]);
			}

			System.out.printf("%s\t %.1f\t%n", student[i], (student[i] / 3f)); // 소수점 표현하기 연습!!

		}

		////////////////// 과목 총점 채우기 //////////////////////
		System.out.println("=================================================");
		System.out.printf("%s\t", "총점");

		///////////////// 과목 총점 /////////////////////////
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				subject[i] += score[j][i];
			}
		}

		for (int i = 0; i < subject.length; i++) {
			System.out.printf("%s\t", subject[i]);
		}
	}
}