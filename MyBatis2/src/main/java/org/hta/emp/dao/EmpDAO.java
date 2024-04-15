package org.hta.emp.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.hta.emp.domain.Emp;

public class EmpDAO {
	
	private SqlSession getSession() {
		SqlSession session = null;
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("org/hta/mybatis/config/sqlMapConfig.xml");
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(reader);
			session = sf.openSession(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return session;
	}

	public List<Emp> getTermList(Map<String, String> m) {
		List<Emp> list = null;
		try (SqlSession session = getSession()) {
			list = session.selectList("org.hta.emp.termlist", m);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return list;
	}

	public List<Emp> getTermList2(Map<String, String> m) {
		List<Emp> list = null;
		try (SqlSession session = getSession()) {
			list = session.selectList("termlist2", m);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return list;
	}

	public List<Emp> getTermList3(Map<String, String> m) {
		List<Emp> list = null;
		try (SqlSession session = getSession()) {
			list = session.selectList("termlist3", m);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return list;
	}

	public List<Emp> getCheck(Map<String, Object> map) {
		List<Emp> list = null;
		try (SqlSession session = getSession()) {
			list = session.selectList("deptnocheck", map);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return list;
	}

	public List<Map<String, Integer>> getCount(Map<String, Object> map) {
		List<Map<String, Integer>> list = null;
		try (SqlSession session = getSession()){
			list = session.selectList("deptnocheckcount", map);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return list;
	}

}
