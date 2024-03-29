//PreparedStatement
/*
 		1.PreparedStatement의 부모는 Statement
 		
 		2.SQL 문장은 실행을 위해서 컴파일이 필요한데 PreparedStatement는 사전에 컴파일 한다.
 		  예)pstmt = conn.prepareStatement(sql);
 		  
 		3.PreparedStatement는 SQL문장이 미리 컴파일 되기 때문에 조건문이 바뀌지 않고
 		  조건값만 바뀌는 경우, 삽입하 데이터만 바뀌는 경우 등에 사용하면 좋다.
 		  즉, 한 번 미리 컴파일을 해두면 같은 쿼리에 대해서 컴파일은 하지 않고 설정해서 수행한다.
 		  (?바인드 변수가 떠오르는 이유는 뭐지)
 		  Statement는 같은 쿼리라고 해도 매번 컴파일 과정을 거친다.
 		  따라서 같은 쿼리를 실행하더라도 PreparedStatement가 Statement보다 실행속도가 빠르다.
 		  
 		  	예) insert into test(no, ename) values(1, '홍길동');
 		  	예) insert into test(no, ename) values(2, '홍길동');
 		  	예) insert into test(no, ename) values(3, '홍길동');
 		  	
 		 4.3번을 적용하기 위해서 쿼리는 다음과 같이 변경한다.
 		   바뀌는 값에 대해서 ?(위치홀더-placeholder-쿼리를 실행할 때 동적으로 값을 전달하는 매개변수)로 표시한다.
 		   	예) insert into test(no, ename) values(?, ?);
 		   	
 		 5.?에 대한 값을 설정하기 위해 "set자료형()" 형태를 사용한다.
 		 	예) 첫번째 ?의 조건값이 정수형 1인 경우 setInt(1,1)
 		 	예) 두번째 ?의 조건값이 문자형 '홍길동'인 경우 setString(2, "홍길동")
 		 	Statement는 SQL문장에서 single quotation(')이 필요한 경우 직접 작성해 주었지만
 		 	PreparedStatement는 자료형에 따라 알아서 single quotation(')를 처리해 준다.
 */

package ex21_7_PreparedStatement;
import java.sql.*;
public class JDBCExample_different_insert1_preparedStatement {
	public static void main(String[] args) {
		Connection conn = null;
		/*
		 * create table test( no number(10), name varchar2(20) )
		 */
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"scott","tiger");
			
			int result=0, count=0;
			long start = System.currentTimeMillis();
			
			String sql = "insert into test(no, name) "
					   + "values(?,?)";
			pstmt = conn.prepareStatement(sql);
			
			for (int i=0; i<10000; i++) {
				pstmt.setInt(1, i);
				pstmt.setString(2, "홍길동");
				result = pstmt.executeUpdate();
				count += result;
			}
			long end = System.currentTimeMillis();
			
			System.out.println("소요시간:" + (end-start) + "ms");	//1443ms
			if (count == 10000)
				System.out.println("삽입 완료");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if (conn != null)
				try {
					conn.close(); //4단계 : DB연결을 끊는다.
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}
	}
}
