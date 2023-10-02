package kr.ch07.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ch07.dto.User6DTO;

@Repository
public class User6DAO {

	@Autowired
	/* Mapper인터페이스를 사용하지 않을 경우 sql세션 등록해야 함.
	  DAO와 DB를 직접 연결 맺고 종료할 필요가 없게 해주며, 
	기본적인 트랜잭션 관리나 쓰레드 처리의 안정성 등을 보장 */
	private SqlSessionTemplate mybatis;
	
	public void insertUser6(User6DTO dto) {
		mybatis.insert("user6.insertUser6", dto);
	}
	
	public User6DTO selectUser6(String uid) {
		return null;
	}
	public List<User6DTO> selectUser6s() {
		return mybatis.selectList("user6.selectUser6s");
	}
	
	public void updateUser6(User6DTO dto) {
		mybatis.update("user6.updateUser6.dto");
	}
	
	public void deleteUser6(String uid) {
		mybatis.delete("user6.deleteUser6.dto");
	}
	
}
