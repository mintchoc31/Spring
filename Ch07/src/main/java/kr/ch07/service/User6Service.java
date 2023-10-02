package kr.ch07.service;

import java.util.List;

import kr.ch07.dao.User6DAO;
import kr.ch07.dto.User6DTO;

public class User6Service {
	
	private User6DAO dao;
	
	public void insertUser6(User6DTO dto) {
		dao.insertUser6(dto);
	}
	
	public User6DTO selectUser6(String uid) {
		return dao.selectUser6(uid);
	}
	
	public List<User6DTO> selectUser6s() {
		return dao.selectUser6s();
	}
	
	public void updateUser6(User6DTO dto) {
		dao.updateUser6(dto);
	}
	
	public void deleteUser6(String uid) {
		dao.deleteUser6(uid);
	}


}
