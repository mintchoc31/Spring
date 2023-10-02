package ch06.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch06.dao.User1DAO;
import ch06.dto.User1DTO;

@Service // 서비스 어노테이션
public class User1Service {
	
	@Autowired
	private User1DAO dao; // 서비스를 거쳐서 다오 호출

	public void insertUser1(User1DTO dto) {
		dao.insertUser1(dto);
	}
	
	public User1DTO selectUser1(String uid) {
		return dao.selectUser1(uid);
	}
	
	public List<User1DTO> selectUser1s() {
		return dao.selectUser1s();
	}
	
	public void updateUser1(User1DTO dto) {
		dao.updateUser1(dto);
	}
	
	public void deleteUser1(String uid) {
		dao.deleteUser1(uid);
	}
}