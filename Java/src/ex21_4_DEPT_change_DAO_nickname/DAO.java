package ex21_4_DEPT_change_DAO_nickname;
import java.sql.*;
import java.util.*;
public class DAO {
	
	List<Map<String, Object>> select() {
		//Map<String, Object> h = new HashMap<String, Object>();
		//List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
		//list : 인터페이스. 인터페이스를 구현한 ArrayList클래스로 객체를 생성해야 한다.
		List<Map<String,Object>> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		

		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"scott","tiger");
			
			stmt = conn.createStatement();
			
			String select_sql =
//					"select deptno, Max(sal) as "+"sal"+", COUNT(*) as"+" cnt "
				"select deptno, max(sal) sal, count(*) cnt "	
				+	"from EMP "
				+	"Group By DEPTNO";
			System.out.print(select_sql+"\n");

			rs = stmt.executeQuery(select_sql);
			
			
			while (rs.next()) {
				
				Map<String, Object> h = new HashMap<String, Object>();
				
				int deptno = rs.getInt("deptno");
				h.put("deptno", deptno);

				int sal = rs.getInt("sal");
				h.put("sal", sal);

				int cnt = rs.getInt("cnt");
				h.put("cnt", cnt);

		
				list.add(h);
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