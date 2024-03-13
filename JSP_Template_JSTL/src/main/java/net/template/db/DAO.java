package net.template.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAO {

	public int isId(String id) {
		return isId(id, null);
	}

	public int isId(String id, String password) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int result=0; //아이디가 존재하지 않는 경우
		try {
			
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
			
			String select_sql = "select id, password from template_join where id=?";
			
			//PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(select_sql.toString());
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				if (rs.getString("password").equals(password)) {
					result = 1;	//아이디와 비밀번호가 일치하는 경우
				} else {
					result = -1; //아이디는 일치하고 비밀번호는 일치하지 않는 경우
				}
			} //if(rs.next())
		} catch (Exception se) {
			se.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
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
			}//finally
		return result;
	}//isId() end

	public int insert(Template_join join) {
		Connection conn=null;
		PreparedStatement pstmt = null;
		int result=0;
		try {
			Context init=new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
			
			String sql = "insert into template_join "
					+ "(id, password, jumin, email, gender, hobby, post, address, intro) "
					+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			System.out.println(sql);
			
			//PreparedStatement 객체 얻기
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, join.getId());
			pstmt.setString(2, join.getPassword());
			pstmt.setString(3, join.getJumin());
			pstmt.setString(4, join.getEmail());
			pstmt.setString(5, join.getGender());
			pstmt.setString(6, join.getHobby());
			pstmt.setString(7, join.getPost());
			pstmt.setString(8, join.getAddress());
			pstmt.setString(9, join.getIntro());
			result = pstmt.executeUpdate();
		} catch (Exception se) {
			se.printStackTrace();
		} finally {
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
		return result;
	}//insert(Template_join join) end;

	public Template_join selectInfo(String id) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
			
			String select_sql = "select * from template_join where id=?";
			
			pstmt = conn.prepareStatement(select_sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			if (rs.next()) {
				Template_join temp = new Template_join();
				temp.setId(rs.getString("id"));
				temp.setPassword(rs.getString("password"));
				temp.setJumin(rs.getString("jumin"));
				temp.setEmail(rs.getString("email"));
				temp.setGender(rs.getString("gender"));
				temp.setHobby(rs.getString("hobby"));
				temp.setPost(rs.getString("post"));
				temp.setAddress(rs.getString("address"));
				temp.setIntro(rs.getString("intro"));
				temp.setRegister_date(rs.getString("register_date"));
				return temp;
			}		
		} catch (Exception se) {
			se.printStackTrace();
		} finally {
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
		}//finally end
		return null;
	} //Template_join selectInfo(String id) end

	public int update(Template_join join) {
		Connection conn=null;
		PreparedStatement pstmt = null;
		int result=0;
		try {
			Context init=new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
			
			String sql = "update template_join "
					+ "set password=?, jumin=?, email=?, gender=?, hobby=?, post=?, address=?, intro=? "
					+ "where id = ?";
			
			System.out.println(sql);
			
			//PreparedStatement 객체 얻기
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, join.getPassword());
			pstmt.setString(2, join.getJumin());
			pstmt.setString(3, join.getEmail());
			pstmt.setString(4, join.getGender());
			pstmt.setString(5, join.getHobby());
			pstmt.setString(6, join.getPost());
			pstmt.setString(7, join.getAddress());
			pstmt.setString(8, join.getIntro());
			pstmt.setString(9, join.getId());
			result = pstmt.executeUpdate();
		} catch (Exception se) {
			se.printStackTrace();
		} finally {
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
		return result;
	}

	public ArrayList<Template_join> selectAll() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<Template_join> list=new ArrayList<Template_join>();
		
		try {
			
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
			
			String select_sql = "select * from template_join "
							  + "where id != 'admin' "
							  + "order by register_date desc";
			
			pstmt = conn.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
				Template_join temp = new Template_join();
				String id = rs.getString("id");
				//String pass = rs.getString("password");
				//String jumin = rs.getString("jumin");
				//String email = rs.getString("email");
				String gender = rs.getString("gender");
				String hobby = rs.getString("hobby");
				//String post = rs.getString("post");
				//String address = rs.getString("address");
				String intro = rs.getString("intro");
				String register_date = rs.getString("register_date");
				
				temp.setId(id);
				//temp.setPassword(pass);
				//temp.setJumin(jumin);
				//temp.setEmail(email);
				temp.setGender(gender);
				temp.setHobby(hobby);
				//temp.setPost(post);
				//temp.setAddress(address);
				temp.setIntro(intro);
				temp.setRegister_date(register_date);
				
				list.add(temp);
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
	return list;
	}//ArrayList<Template_join> selectAll() end

	public int delete(String id) {
		Connection conn=null;
		PreparedStatement pstmt = null;
		int result=0;
		try {
			Context init=new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
			
			String sql = "delete from template_join "
					   + "where id = ? ";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
			
		} catch (Exception se) {
			se.printStackTrace();
		} finally {
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
		}//finally end
		return result;
	}//delete() 메소드 끝
}//class end