package ex21_2_select_statement;
import java.sql.*;
public class JDBCExample2_Oralce1_column_name_goodsinfo {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"scott","tiger");
			
			stmt = conn.createStatement();
			
			String select_sql
			= "select code, name, price, maker "
			+ "from goodsinfo "
			+ "where name='디지털 TV'";
			rs = stmt.executeQuery(select_sql);
			
			System.out.printf("%s\t%s\t%-10s\t%s\t%s\n",
					"번호","상품코드","상품명","가격","제조사");
					
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
			if (stmt != null)
				try {
					stmt.close();
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