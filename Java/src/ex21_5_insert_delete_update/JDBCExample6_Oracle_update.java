//데이터베이스의 테이블에 데이터를 변경하는 프로그램
package ex21_5_insert_delete_update;
import java.sql.*;
public class JDBCExample6_Oracle_update {
	//10004 오라클
	//4		10004	전자사전	180000 	오라클
	public static void main(String args[]) {
		if(args.length !=2) {
			System.out.println("상품코드, 제조사 입력하세요");
			return;
		}
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			
			String single = "'";
			String up_sql
			= "update goodsinfo "
			+ "set maker = " + single + args[1] + single
			+ " where code = " + single + args[0] + single;
			System.out.println(up_sql);
			int rowNum=stmt.executeUpdate(up_sql);
			System.out.println(rowNum + "행이 수정되었습니다.");
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}