package ch05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch05.dto.User1DTO;
import ch05.service.User1Service;

@Controller
public class User1Controller {

	@Autowired
	private User1Service service;
	
/* GetMapping 
    HTTP GET 요청을 처리하는 메서드를 맵핑(@RequestMapping) 하는 어노테이션.
    데이터를 가져올 때 사용한다.
    메서드(url)에 따라 어떤 페이지를 보여줄지 결정하는 역할을 한다. */
	
	@GetMapping("/user1/register")
	public String register() {		
		return "/user1/register";
	}
	
/*  PostMapping
	POST 요청을 하는 API의 어노테이션.
	데이터를 게시할 때 사용한다.      */
	
	@PostMapping("/user1/register")
	public String register(User1DTO dto) {
		service.insertUser1(dto);
		return "redirect:/user1/list";
	}
	
	@GetMapping("/user1/list")
	public String list(Model model) {
		
		List<User1DTO> users = service.selectUser1s();
		model.addAttribute("users", users);	
		return "/user1/list";
	}
	
/*	RequestParam 
	HTTP 요청 파라미터를 메서드의 파라미터로 전달받을 때 사용 */
 													
	@GetMapping("/user1/modify")
	public String modify(@RequestParam("uid") String uid, Model model) {
		
		User1DTO user = service.selectUser1(uid);
		model.addAttribute(user);
		
		return "/user1/modify";
	}
/*  ModelAttribute	
	
	@PostMapping("/user1/modify")
	public String modify(@ModelAttribute User1DTO dto) {
		service.updateUser1(dto);
		return "redirect:/user1/list";
	}
	
	@GetMapping("/user1/delete")
	public String delete(String uid) {
		service.deleteUser1(uid);
		return "redirect:/user1/list";
	}
	
}