//데이터베이스의 테이블에 데이터를 변경하는 프로그램
package ex21_7_PreparedStatement;
import java.sql.*;
public class JDBCExample6_Oracle_update_preparestatement {
	//코드 10001의 제조사를 HTA로 변경하기
	//"10001" "HTA"
	public static void main(String args[]) {
		if(args.length !=2) {
			System.out.println("상품코드,제조사 입력하세요");
			return;
		}

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
//			String single = "'";
			String up_sql
			= "update goodsinfo set maker = ? "
			+ "where code = ?";
//			+ "set maker = " + single + args[1] + single
//			+ " where code = " + single + args[0] + single;
			System.out.println(up_sql);
			
			pstmt = conn.prepareStatement(up_sql);
			pstmt.setString(1, args[1]);
			pstmt.setString(2, args[0]);
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum + "행이 수정되었습니다.");
			
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