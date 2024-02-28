package ex21_4_DEPT_change_DAO_nickname;
import java.util.*;
public class TEST {
	public static void main(String[] args) {
		DAO dao = new DAO();
		List<Map<String, Object>> list = dao.select();

		if (list.isEmpty()) {
			System.out.println("조회된 결과가 없습니다.");			
		} else {
			System.out.println("---------- 별칭으로 접근  ------------");
			System.out.println("번호\t부서번호\t최고급여\t부서인원수");
			System.out.println("-----------------------------------");
			int no = 1;
			for (Map<String, Object> h : list) {
				System.out.println(no++ + "\t" +  h.get("deptno") 
				                        + "\t" + h.get("sal") + "\t" + h.get("cnt") + "명");
			}
		}
	}
}