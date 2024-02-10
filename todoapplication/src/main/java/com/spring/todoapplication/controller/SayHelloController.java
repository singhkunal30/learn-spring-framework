package com.spring.todoapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SayHelloController {
	//using JSP
	
	@RequestMapping("say-hello-jsp")
	public String sayHello() {
		return "sayHello";
	}

}
