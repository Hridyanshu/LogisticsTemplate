package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/login")
	public String login() {
		return "login.jsp";
	}

	@RequestMapping("/signup")
	public String signup() {
		return "signup.jsp";
	}

	@RequestMapping("/track")
	public String track() {
		return "track.jsp";
	}
	
	@RequestMapping("/success")
	public String success() {
		return "success.jsp";
	}

}