package ch06.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ch06.dto.User1DTO;
import ch06.service.User1Service;

@Controller
public class User1Controller {
	
	@Autowired // 객체 주입받음 
	private User1Service service; // 서비스를 밑에서 사용하기 위해서 선언
	

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
	
	
}