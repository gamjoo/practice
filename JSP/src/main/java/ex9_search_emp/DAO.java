package ex9_search_emp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
/*
DAO(Data Access Object) 클래스
데이터베이스와 연동하여 레코드의 추가, 수정, 삭제 작업이 이루어지는 클래스
 */
public class DAO {
	
	public ArrayList<Emp> select(int field, String search) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<Emp> list=new ArrayList<Emp>();
		String[] fieldset = { "empno", "ename", "job", "mgr", "hiredate", "sal", "comm", "deptno" };
		try {
			
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
			
			String select_sql = "select * from emp where "
							  + fieldset[field] + " like" + " '%" + search + "%'";
		
			pstmt = conn.prepareStatement(select_sql);
			System.out.print(select_sql);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				
				Emp emp=new Emp();
				
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
		} catch (SQLException | NamingException se) {
			System.out.println(se.getMessage());
			// 오류처리 관련 객체의 공통조상 Exception으로 catch를 작성해도 된다
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
		} //finally
		
		return list;
		//return null;
	}//selectAll() end
}//class end