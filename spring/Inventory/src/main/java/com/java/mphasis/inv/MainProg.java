package com.java.mphasis.inv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/java/mphasis/inv/wire.xml");
		OrderDAO dao = (OrderDAO)ctx.getBean("orderlogic");
		dao.display();
	}
}
