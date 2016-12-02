package spring.beans.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spring.beans.annotation.User;
import spring.beans.annotation.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private User user ;
	
	public void execute(){
		System.out.println("±Ìœ÷≤„£∫÷¥––");
		userService.add(user);
	}
}
