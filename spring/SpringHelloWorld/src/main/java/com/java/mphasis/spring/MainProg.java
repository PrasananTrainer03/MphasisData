package com.java.mphasis.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new 
				ClassPathXmlApplicationContext("com/java/mphasis/spring/Hello.xml");
		Hello h = (Hello)ctx.getBean("beanHello");
		System.out.println(h.sayHello("Hari"));
	}
}
