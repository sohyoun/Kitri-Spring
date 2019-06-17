package com.kitri.hello4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration //hello3의 applicationContext.xml 대신 Factory를 설정파일로 쓸 것이다. 라고 annotaion 해줘야함 
public class HelloServiceFactory {
	@Bean(name = {"hs", "helloservice"}) //여기서 만들어지는 객체를 Bean으로 쓸 것이다.
	@Scope(value = "prototype") // 싱글톤이 value의 default 값. prototype으로 지정하면 싱글톤이 아니라 새로운 객체를 계속 만들게 된다.
	public HelloService getHelloService() {
		return new HelloServiceKor(); // new를 하더라도 새로운 객체가 만들어지는 것이 아니다. 알아서 싱글톤 지정 됨
	}
}

