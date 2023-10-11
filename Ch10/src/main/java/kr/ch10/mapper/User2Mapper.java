package kr.ch10.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ch10.dto.User1DTO;

@Mapper
public interface User2Mapper {

	public void insertUser1(User1DTO dto) {
		return mapper.insertUser1(dto);
	};
	public User1DTO selectUser1(String id) {
		return mapper.selectUser1(id);
	};
	public List<User1DTO> selectUser1s() {
		return mapper.selectUser1s();
	};
	public int updateUser1(User1DTO dto) {
		return mapper.updateUser1(dto);
	};
	public int deleteUser1(String id) {
		return mapper.deleteUser1(id);
	};

}
