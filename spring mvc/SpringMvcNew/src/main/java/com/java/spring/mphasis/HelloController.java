package com.java.spring.mphasis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		return new ModelAndView("result", "message", "Welcome to Spring MVC");
	}
	
	@RequestMapping("/panchali")
	public ModelAndView panchali() {
		return new ModelAndView("result", "message", "HI I am Panchali...");
	}
}
