package com.java.mphasis.calc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/mphasis/calc/Calc.xml");
		Calc c =(Calc)ctx.getBean("calcBean");
		System.out.println(c.sum());
		System.out.println(c.sub());
		System.out.println(c.mult());
	}
}
