package com.glen.SpringCoreIOC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App {
	public static void main(String[] args) {
		
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring.xml");
		
		Coder coder = (Coder) beanFactory.getBean("coder");
		coder.age=15;
		System.out.println(coder.age);
		
		Coder coder1 = (Coder) beanFactory.getBean("coder");
		System.out.println(coder1.age);
		
	
		
	}
}
