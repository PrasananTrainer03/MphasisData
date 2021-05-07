package com.java.mphasis.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req,
							HttpServletResponse res) {
		String user = req.getParameter("userName");
		String pwd = req.getParameter("passWord");
		if (user.equals("Hari") && pwd.equals("Bhanu")) {
			return new ModelAndView("success", "message", "Welcome to All...");
		} else {
			return new ModelAndView("login","message","Invalid Credentials...");
		}
	}
}
