package com.glen.SpringCoreIOC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings({ "unused", "deprecation" })
public class App {
	public static void main(String[] args) {
		
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		@SuppressWarnings("resource")
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring.xml");
		Coder coder = (Coder) beanFactory.getBean("coder");
		coder.code();
		System.out.println(coder.getAge());
		
	}
}
