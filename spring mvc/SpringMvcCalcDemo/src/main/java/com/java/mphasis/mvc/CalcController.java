package com.java.mphasis.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController {

	@RequestMapping("/calc")
	public ModelAndView calc(HttpServletRequest req,
			HttpServletResponse res) {
		int a,b,c;
		a=Integer.parseInt(req.getParameter("firstNo"));
		b=Integer.parseInt(req.getParameter("secondNo"));
		c=a+b;
		String result="";
		result+=c;
		return new ModelAndView("result","result",result);
	}
}
