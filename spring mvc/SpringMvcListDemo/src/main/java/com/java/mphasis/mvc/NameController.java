package com.java.mphasis.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameController {

	@RequestMapping("/names")
	public ModelAndView show() {
		List<String> lstNames=new ArrayList<String>();
		lstNames.add("Hari");
		lstNames.add("Nilesh");
		lstNames.add("Manoj");
		lstNames.add("Olivia");
		lstNames.add("Nidhi");
		return new ModelAndView("result","lstNames",lstNames);
	}
}
