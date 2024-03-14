package _6.getJSON;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class DAO {

	public JsonArray getArray() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		JsonArray array = new JsonArray();
		
		try {
			
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
			
			String select_sql = "select * from dept";
			pstmt = conn.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
				JsonObject json = new JsonObject();
				json.addProperty("deptno", rs.getInt("deptno"));
				json.addProperty("dname", rs.getString("dname"));
				json.addProperty("loc", rs.getString("loc"));
				
				array.add(json);
			}
		} catch (Exception se) {
			se.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}			
	}
		return array;
	}

}
