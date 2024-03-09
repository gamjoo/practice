package ex21_8_PreparedStatement_Student3;

import java.sql.*;
import java.util.ArrayList;

public class DAO {
	public int insert(Student3 student) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			
			String insert_sql = "insert into student "
					   + "values(student_seq.nextval, ?, ?, ?, ?, ?, ?, "
					   + "(select grade from hakjum "
					   + "where ? between lowscore and hiscore)"
					   + ")";
			
			System.out.println(insert_sql);
			
			pstmt = conn.prepareStatement(insert_sql);

			pstmt.setString(1,student.getName());
			pstmt.setInt(2,student.getKor());
			pstmt.setInt(3, student.getMath());
			pstmt.setInt(4, student.getEng());
			pstmt.setInt(5, student.getTot());
			pstmt.setFloat(6, student.getAvg());
			pstmt.setFloat(7, student.getAvg());
			
			result = pstmt.executeUpdate();
		
			
			if(result == 1) 
				System.out.println("db에 반영됨");
			else
				System.out.println("db에 반영 안 됨");
			
	} catch (ClassNotFoundException cnfe) {
		System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
	} catch (SQLException se) {
		System.out.println(se.getMessage());
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
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	return result;
	}
	
	public ArrayList<Student3> selectAll() {
		ArrayList<Student3> list = new ArrayList<Student3>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"scott","tiger");
			
			
			String select_all = "select * from student order by no";
			System.out.println(select_all);
			
			pstmt = conn.prepareStatement(select_all);
			rs = pstmt.executeQuery();
			

				
				while (rs.next()) {
					
					Student3 student = new Student3();
					
					int no = rs.getInt(1);
					String name = rs.getString(2);
					int kor = rs.getInt(3);
					int math = rs.getInt(4);
					int eng = rs.getInt(5);
					int tot = rs.getInt(6);
					Float avg = rs.getFloat(7);
					String grade = rs.getString(8);
					
					student.setNo(no);
					student.setName(name);
					student.setKor(kor);
					student.setMath(math);
					student.setEng(eng);
					student.setTot(tot);
					student.setAvg(avg);
					student.setGrade(grade);
					
					
					list.add(student);
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
		}
		return list;
	}
	
	public Student3 select(int num) {
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		Student3 student = null;
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"scott","tiger");
			
			String select_sql = "select * from student "
							  + "where no = "+num;
			System.out.println(select_sql);
			
			
			pstmt = conn.prepareStatement(select_sql);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				student = new Student3();				
				int no = rs.getInt(1);
				String name = rs.getString(2);
				int kor = rs.getInt(3);
				int math = rs.getInt(4);
				int eng = rs.getInt(5);
				int tot = rs.getInt(6);
				Float avg = rs.getFloat(7);
				String grade = rs.getString(8);
				
				student.setNo(no);
				student.setName(name);
				student.setKor(kor);
				student.setMath(math);
				student.setEng(eng);
				student.setTot(tot);
				student.setAvg(avg);
				student.setGrade(grade);
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
		}
		return student;
	}
	
	public int update(Student3 student) {
		Connection conn=null;
		PreparedStatement pstmt = null;
		int result = -1;

		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"scott","tiger");
			
			
			String update_sql = "update student "
							  + "set name=?, kor=?, math=?, eng=?, tot=?, avg=?, "
							  + "grade=(select grade from hakjum where ? between lowscore and hiscore)"
							  + " where no = ?";
			
			System.out.println(update_sql);
			pstmt = conn.prepareStatement(update_sql);
			
			pstmt.setString(1, student.getName());
			pstmt.setInt(2, student.getKor());
			pstmt.setInt(3, student.getMath());
			pstmt.setInt(4, student.getEng());
			pstmt.setInt(5, student.getTot());
			pstmt.setFloat(6, student.getAvg());
			pstmt.setFloat(7, student.getAvg());
			pstmt.setInt(8, student.getNo());
			
			result = pstmt.executeUpdate();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
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
		return result;
	}
	
	public int delete(int num) {
		Connection conn=null;
		PreparedStatement pstmt = null;
		int result = -1;
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"scott","tiger");
			
			String del_sql = "delete from student where no = ?";
			System.out.println(del_sql);
			
			pstmt = conn.prepareStatement(del_sql);
			
			pstmt.setInt(1, num);
			
			result = pstmt.executeUpdate();
	} catch (ClassNotFoundException cnfe) {
		System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
	} catch (SQLException se) {
		System.out.println(se.getMessage());
	} finally {
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
	return result;
	}
}
