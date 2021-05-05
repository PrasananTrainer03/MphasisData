package com.java.mphasis.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/mphasis/spring/Name.xml");
		Name name = (Name)ctx.getBean("beanName");
		System.out.println(name.show());
	}
}
