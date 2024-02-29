package Homework_240206;

import java.sql.*;
import java.util.ArrayList;

import ex21_6_EMP.Emp;

public class DAO {
	
	ArrayList<Emp> search(int menu, String search_word) {
	//Map<String, Object> h = new HashMap<String, Object>();
	//List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
	//list : 인터페이스. 인터페이스를 구현한 ArrayList클래스로 객체를 생성해야 한다.
	ArrayList<Emp> list = new ArrayList<Emp>();
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String menus[] = { "empno", "ename", "job", "mgr", "hiredate", "sal", "comm", "deptno", "종료" };

	try {
		String driver = "oracle.jdbc.driver.OracleDriver";
		Class.forName(driver);
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		conn = DriverManager.getConnection(url,"scott","tiger");
		
		stmt = conn.createStatement();
		
		String select_sql = null;
		
		if(menu != 8) {
			select_sql =
					"select * "
				  + "from EMP "
				  + "where "+menus[menu]+"="+search_word;
		} else {
			select_sql = "select * from EMP";
		}
		
		System.out.print(select_sql+"\n");
		rs = stmt.executeQuery(select_sql);


		
		while (rs.next()) {
			
			Emp emp = new Emp();
			
			int empno = rs.getInt(1);
			String ename = rs.getString(2);
			String job = rs.getString(3);
			int mgr = rs.getInt(4);
			Date hiredate = rs.getDate(5);
			int sal = rs.getInt(6);
			int comm = rs.getInt(7);
			int deptno = rs.getInt(8);
			
			emp.setEmpno(empno);
			emp.setEname(ename);
			emp.setJob(job);
			emp.setMgr(mgr);
			emp.setHiredate(hiredate);
			emp.setSal(sal);
			emp.setComm(comm);
			emp.setDeptno(deptno);
	
			list.add(emp);
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