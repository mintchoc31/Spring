package kr.ch07.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.ch07.dto.User6DTO;
import kr.ch07.service.User6Service;

@Controller
public class User6Controller {

	@Autowired
	private User6Service service;
	
	@GetMapping("/user6/register")
	public String register() {
		return "/user6/register";
	}
//
	@GetMapping("/user6/list")
	public String list() {
		
		
		return "/user6/list";
	}
	
	@PostMapping("/user6/register")
	public String register(User6DTO dto) {
		service.insertUser6(dto);
		return "redirect:/user6/list";
	}
	
}
