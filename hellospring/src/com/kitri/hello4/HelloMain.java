package com.kitri.hello4;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class HelloMain {
	public static void main(String[] args) {

		System.out.println("프로그램 시작!!!");
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloServiceFactory.class);
		//helloServiceFactory가 설정파일이라는 annotaion을 해줘야한다. xml대신 factory를 쓰도록
		
		System.out.println("설정파일 읽었다!!!");
		HelloService helloService = context.getBean("hs", HelloService.class);
		System.out.println("service 얻어왔다!!!!");
		String msg = helloService.hello("박소현");
		
		System.out.println(msg);
		
		
		HelloService helloService1 = context.getBean("hs", HelloService.class);
		HelloService helloService2 = context.getBean("hs", HelloService.class);
		System.out.println(helloService1 + "   " + helloService2); //주소값 같게 나옴 
																   //>> Scope에 value를 prototype으로 지정하면 주소값 다르게 나옴
		//싱글톤 신경쓸 필요 x
	}
}
