package com.kitri.hello3;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class HelloMain {
	public static void main(String[] args) {
//		HelloServiceKor helloServiceKor = new HelloServiceKor();
//		String msg = helloServiceKor.helloKor("박소현");
		
//		Resource resource = new ClassPathResource("com/kitri/hello3/applicationContext.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		HelloService helloService = (HelloService) factory.getBean("hs");
		System.out.println("프로그램 시작!!!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kitri/hello3/applicationContext.xml");
		System.out.println("설정파일 읽었다!!!");
		HelloService helloService = context.getBean("hs", HelloService.class);
		System.out.println("service 얻어왔다!!!!");
		String msg = helloService.hello("박소현");
		
		System.out.println(msg);
		
//		HelloService h1 = new HelloServiceKor();
//		HelloService h2 = new HelloServiceEng();
//		System.out.println(h1 + "   " + h2);
		
		HelloService h3 = context.getBean("hs", HelloService.class);
		HelloService h4 = context.getBean("hs", HelloService.class);
		System.out.println(h3 + "   " + h4);
		//싱글톤은 설정파일이 읽히기 전에 생성되고  protocol은 getBean 할 때 생성됨
	}
}
