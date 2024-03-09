package ex8_search;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import ex8.Dept;
/*
DAO(Data Access Object) 클래스
데이터베이스와 연동하여 레코드의 추가, 수정, 삭제 작업이 이루어지는 클래스
 */
public class DAO {
	
	public ArrayList<Dept> selectAll() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<Dept> list=new ArrayList<Dept>();
		
		try {
			
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
			
			String select_sql = "select * from dept";
			
			//PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(select_sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) { //더 이상 읽을 데이터가 없을 때까지 반복
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				Dept dept=new Dept();
				dept.setDeptno(deptno);
				dept.setDname(dname);
				dept.setLoc(loc);
				list.add(dept);
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
	}//selectAll() end
	
	
	public ArrayList<Dept> select(int inputdeptno) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<Dept> list=new ArrayList<Dept>();
		
		try {
		
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
		conn = ds.getConnection();
		
		String select_sql = "select * from dept where deptno=?";
		
		//PreparedStatement 객체 얻기
		pstmt = conn.prepareStatement(select_sql);
		pstmt.setInt(1, inputdeptno);
		rs = pstmt.executeQuery();
		
		while (rs.next()) { //더 이상 읽을 데이터가 없을 때까지 반복
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			Dept dept=new Dept();
			dept.setDeptno(deptno);
			dept.setDname(dname);
			dept.setLoc(loc);
			list.add(dept);
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
	}//select() end
}//class end