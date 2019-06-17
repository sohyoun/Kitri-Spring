package com.kitri.hello4;

import com.kitri.hello3.HelloService;

public class HelloServiceEng implements HelloService{
	public HelloServiceEng() {
		System.out.println("HelloServiceEng 생성자 호출!!!");
	}
	public String hello(String name) {
		return "Hello " + name + "!!!";
	}
}
