//데이터베이스의 테이블에 데이터를 삭제하는 프로그램
package ex21_7_PreparedStatement;
import java.sql.*;
public class JDBCExample5_Oracle_delete_preparedstatement {
	public static void main(String[] args) {
		if (args.length != 1) {	//"A5000"
			System.out.println("상품코드 입력하세요");
			return;
		}
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
//			String single="'";
			String del_sql
			= "delete from goodsinfo "
			+ "where code = ?";
//			+ "where code = " + single + args[0] + single;
			System.out.println(del_sql);
	//PreparedStatement 객체를 만들면서, 실행할 sql문을 매개변수로 입력해야 한다.
			pstmt = conn.prepareStatement(del_sql);
			pstmt.setString(1, args[0]);
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum + "행이 삭제되었습니다.");
		
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
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