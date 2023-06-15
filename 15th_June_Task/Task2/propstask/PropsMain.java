package com.dal.propstask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropsMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spr-propstask.xml");
		
		MyDao dao = (MyDao) context.getBean("dao");
		System.out.println("Connection string: "+dao.getMyConnection());
		
		
	}

}
