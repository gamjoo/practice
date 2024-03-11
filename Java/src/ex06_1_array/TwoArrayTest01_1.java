package ex06_1_array;

public class TwoArrayTest01_1 {
	public static void main(String[] args) {
		String name[] = { "강호동", "이승기", "유재석", "하하", "이광수" };
		String sub_name[] = { "국어", "수학", "영어" };

		int[][] score = {
				{ 85, 60, 70 }, // 0행(1번학생)
				{ 90, 95, 80 }, // 1행(2번학생)
				{ 75, 80, 100 }, // 2행(3번학생)
				{ 80, 70, 95 }, // 3행(4번학생)
				{ 100, 65, 80 } // 4행(5번학생)
		};
		
		int[] subject = new int[3]; // 과목총점 저장
		int[] student = new int[5]; // 학생의 총점 저장
	
	
	System.out.println("===각 과목별 총점 구하기===");
//	//국어과목 총점
//	subject[0] = score[0][0] + score[1][0]+score[2][0]+score[3][0]+score[4][0];
//	//수학과목 총점
//	subject[1] = score[0][1] + score[1][1]+score[2][1]+score[3][1]+score[4][1];
//	//영어과목 총점
//	subject[2] = score[0][2] + score[1][2]+score[2][2]+score[3][2]+score[4][2];
//	
//	for (int i=0; i<subject.length; i++) {
//		System.out.println(sub_name[i]+"의 총점 = "+subject[i]);
//	}
	
	for (int i=0; i<3; i++) {
		for (int j=0; j<5; j++) {
			subject[i] += score[j][i];
			//subject[j] = subject[j] + score[i][j]

		}
		System.out.println(sub_name[i]+"의 총점 = "+subject[i]);


	}

//굳이 아래 명령문을 따로 써 줄 필요가 없음. 학생별로 총점 구하고 바로 출력하는 논리로 생각했어야 함	
//	for (int i=0; i<subject.length; i++) {
//		System.out.println(sub_name[i]+"의 총점 = "+subject[i]);
	
	
	System.out.println("===학생별 총점구하기===");
	
	for(int n=0; n<score.length; n++) {
		for (int m=0; m<score[n].length; m++) {
			student[n] += score[n][m];
				
		}
	System.out.println(name[n]+"의 총점 = "+student[n]);
	
	}

	//굳이 아래 명령문을 따로 써 줄 필요가 없음. 학생별로 총점 구하고 바로 출력하는 논리로 생각했어야 함
//	for (int o=0; o<score.length; o++) {
//		System.out.println(name[o]+"의 총점 = "+student[o]);
	}
	
}
