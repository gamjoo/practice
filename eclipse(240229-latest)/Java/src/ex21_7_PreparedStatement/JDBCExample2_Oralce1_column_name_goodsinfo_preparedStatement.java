package ex21_7_PreparedStatement;
import java.sql.*;
public class JDBCExample2_Oralce1_column_name_goodsinfo_preparedStatement {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"scott","tiger");
			
			String sel_where_sql
			= "select code, name, price, maker "
			+ "from goodsinfo "
			+ "where name= ?";
			
			pstmt = conn.prepareStatement(sel_where_sql);
			
			//이 문장을 주석으로 처리하면 에러 - 인덱스에서 누락된 IN 또는 OUT 매개변수:: 1
			//첫 번째 매개변수로 입력한 1은 firstparameter를 의미한다.
			pstmt.setString(1, "디지털 TV");
			rs = pstmt.executeQuery();
			
//			System.out.printf("%s\t%s\t%-10s\t%s\t%s\n",
//					"번호","상품코드","상품명","가격","제조사");
			System.out.println("번호\t상품코드\t상품명\t\t가격\t제조사");		
			System.out.println("----------------------------------------------------------");			
			int i=0;
			while (rs.next()) {
				int code = rs.getInt("code");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String maker = rs.getString("maker");
				
				System.out.printf("%d\t%d\t%-10s\t%d\t%s\n",
						++i,code,name,price,maker);
			}
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}