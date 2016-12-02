package spring.beans.generic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spring.beans.generic.User;
import spring.beans.generic.service.BaseService;

@Controller
public class UserController<T> {
	@Autowired
	private BaseService<User> baseService;

	@Autowired
	private User user;

	public void execute() {
		System.out.println("±Ìœ÷≤„£¨÷¥––");
		baseService.add(user);
	}
}
