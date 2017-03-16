package com.open.suns.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.open.suns.entity.User;
import com.open.suns.service.UserService;

@Controller
public class UserController {
	
	private static Logger logger = Logger.getLogger(UserController.class);
	
	@Resource(name = "UserService")
	UserService userService;
	
	@RequestMapping("login")
	public ModelAndView login() {
		ModelAndView andView = new ModelAndView("login", "command", new User());
		logger.info("sdsadasdad");
		return andView;
	}
	@RequestMapping("register")
	public ModelAndView register() {
		ModelAndView andView = new ModelAndView("result");
		User user = new User();
		user.setName("张三");
		user.setAge(15);
		logger.info("张三");
		userService.register(user);
		return andView;
	}
	
}
