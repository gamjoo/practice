package Homework_240205;
import java.sql.*;
import java.util.*;
public class DAO {
	
	List<GoodsInfo> select() {
		List<GoodsInfo> list = new ArrayList<GoodsInfo>();
		//list : 인터페이스. 인터페이스를 구현한 ArrayList클래스로 객체를 생성해야 한다.
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"scott","tiger");
			
			stmt = conn.createStatement();
			
			String select_sql = "select * from goodsinfo";
			rs = stmt.executeQuery(select_sql);
			
			
			while (rs.next()) {
				String code = rs.getString("code");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String maker = rs.getString("maker");
				
				GoodsInfo goodsinfo = new GoodsInfo();
				
				goodsinfo.setCode(code);
				goodsinfo.setName(name);
				goodsinfo.setPrice(price);
				goodsinfo.setMaker(maker);
				
				list.add(goodsinfo);

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
		return list;
	}
}