package com.java.mphasis.spring;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployController {

	@RequestMapping("/addemploy") 
	public ModelAndView addEmploy(HttpServletRequest req, HttpServletResponse res) {
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(req.getParameter("empno")));
		employ.setName(req.getParameter("name"));
		employ.setGender(req.getParameter("gender"));
		employ.setDept(req.getParameter("dept"));
		employ.setDesig(req.getParameter("desig"));
		employ.setBasic(Integer.parseInt(req.getParameter("basic")));
		String result = new EmployDAO().addEmploy(employ);
		return new ModelAndView("addemployresult", "result", result);
	}
	@RequestMapping("/searchemploy")
	public ModelAndView searchEmploy(HttpServletRequest req, HttpServletResponse res) {
		int empno = Integer.parseInt(req.getParameter("empno"));
		Employ employ = new EmployDAO().searchEmploy(empno);
		return new ModelAndView("searchempresult", "employ", employ);
	}
	@RequestMapping("/showemploy")
	public ModelAndView employShowAll() {
		List<Employ> employList = new EmployDAO().showEmploy();
		return new ModelAndView("showresult", "emps", employList);
	}
}
