package kr.ch10.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.ch10.dto.User1DTO;

@Controller
public class MyUser2Controller {

	@GetMapping("/user1/list")
	public String list() {
		return "/user1/list";
	}
	
	@GetMapping("/user1/register")
	public String register() {
		return "/user1/register";
	}
	
	@PostMapping("/user1/register")
	public String register(User1DTO dto) {

		service.insertUser1(dto);
		
		return "redirect:/user1/list";
	}
	
	@GetMapping("/user1/modify")
	public String modify() {
		return "/user1/modify";
	}
	
	@PostMapping("/user1/modify")
	public String modify(User1DTO dto) {
		service.updateUser1(dto);
		return "/user1/modify";
	}
	
	@GetMapping("/user1/delete")
	public String delete(String id) {
		service.deleteUser1(id);
		return "/user1/modify";
	}

}
