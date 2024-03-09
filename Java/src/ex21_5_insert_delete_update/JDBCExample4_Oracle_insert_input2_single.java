package ex21_5_insert_delete_update;
import java.sql.*;
public class JDBCExample4_Oracle_insert_input2_single {
	public static void main(String[] args) {
		//"A2000" "모니터" 200 "삼성"
		if (args.length != 4) {
			System.out.println(
					"상품코드 상품명 가격 제조사를 입력하세요");
			return;
		}
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			
			/*
			 * 1. 직접 데이터를 입력하는 경우
			 * insert into goodsinfo
			 * values('A1000', '고급 핸드폰', 100, 'LG')
			 * 
			 */
				String single = "'";
				String sql = "insert into goodsinfo"
						+ "(code, name, price, maker) "
						+ "values"
						+ "(" + single + args[0] + single + ", "
						+ 		single + args[1] + single + ", "
						+		 		 args[2] + 			", "
						+ 		single + args[3] + single + ")";
				System.out.println(sql);
				int rowNum = stmt.executeUpdate(sql);
				System.out.println(rowNum + "행이 추가되었습니다.");
				


			
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