package ch06.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch06.dto.User1DTO;

@Repository
public class User1DAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertUser1(User1DTO dto) {
		mybatis.insert("user1.insertUser1", dto); // 반환(리턴)x 코드 작성
	}
	
	public User1DTO selectUser1(String uid) {
		return null; // 리턴 없으면 에러남. DTO만 반환 가능
	}
	
	public List<User1DTO> selectUser1s() { // 리스트 반환
		return mybatis.selectList("user1.selectUser1s");
		
	}
	
	public void updateUser1(User1DTO dto) {
		mybatis.update("user1.updateUser1.dto");
		
	}
	
	public void deleteUser1(String uid) {
		mybatis.delete("user1.deleteUser1.dto");
	}
	
	
	 
}