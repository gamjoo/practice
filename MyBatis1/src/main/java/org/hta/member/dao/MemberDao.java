package org.hta.member.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.hta.member.domain.Member;

public class MemberDao {
	
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

	public int chk(Member member) {
		int result = 0; //아이디가 없는 경우
		
		try (SqlSession session = getSession()) {
			//조회결과가 없는 경우 dbmember는 null이다.
			Member dbmember = (Member) session.selectOne("org.hta.mybatis.member.select",
														  member.getId());
			if (dbmember != null) {
				if (dbmember.getId().equals(member.getId())) 
					result = -1; //아이디 같고 비밀번호가 다른 경우
				if (dbmember.getPassword().equals(member.getPassword())) 
					result = 1; //아이와 비번 같은 경우
			} else {
				System.out.println("chk() 결과 = null"); //사용자가 입력한 id와 db에 일치하는 id가 없다
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int insert(Member member) {
		int result = 0;
		try (SqlSession session = getSession()) {
			result = session.insert("org.hta.mybatis.member.insert", member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<Member> list() {
		List<Member> list = null;
		try(SqlSession session = getSession()) {
			list = session.selectList("list"); //xml이 단 1개 존재, id도 모두 중복되지 않게 다르게 작성하면서 중복 여지가 없다.
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
