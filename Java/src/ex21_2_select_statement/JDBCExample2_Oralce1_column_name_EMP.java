package ex21_2_select_statement;
import java.sql.*;
public class JDBCExample2_Oralce1_column_name_EMP {
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
			
			String select_sql = "select * from emp";
			rs = stmt.executeQuery(select_sql);
			
			System.out.printf("%s\t%s\t%s\t%10s\t%5s\t%10s\t%5s\t%10s\t%5s\t\n",
					"번호","사원번호","사원이름","직급","상사","입사일","급여","커미션","부서번호");
					
			System.out.println("----------------------------------------------------------"
					+ "-------------------------------------------------------------------");
			
			int i=0;
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				System.out.printf("%d\t%d\t%s\t%10s\t%5d\t%10s\t%5d\t%10d\t%5d\t\n",
						++i,empno,ename,job,mgr,hiredate,sal,comm,deptno);
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
