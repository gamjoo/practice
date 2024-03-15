package net.member.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	private DataSource ds;
	
	//생성자에서 JDNI 리소스를 참조하여 Connection 객체를 얻어온다.
	public MemberDAO() {
		try {
			Context init = new InitialContext();
			this.ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
		} catch (Exception ex) {
			System.out.println("DB 연결 실패 : " + ex);
		}
	}
	
	public int isId(String id) {
		int result = -1; //DB에 해당 id가 없다.
		String sql = "select id from member where id = ? ";
		
		//try-with-resource문
		try (Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, id);
			
			try (ResultSet rs = pstmt.executeQuery()) {
				if(rs.next()) {
					result=0; //DB에 해당 id가 있다.
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
				e.printStackTrace();
		}
	return result;
	}//isId() end

	public int insert(Member m) {
		int result=0;
		String sql = "insert into member "
				   + "(id, password, name, age, gender, email) "
				   + "values (?,?,?,?,?,?)";
		try (Connection con = ds.getConnection();
			 PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPassword());
			pstmt.setString(3, m.getName());
			pstmt.setInt(4, m.getAge());
			pstmt.setString(5, m.getGender());
			pstmt.setString(6, m.getEmail());
			result = pstmt.executeUpdate(); //insert 성공시 result는 1
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}//insert end
}