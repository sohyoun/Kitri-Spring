package com.kitri.hello1;

import com.kitri.hello2.HelloService;

public class HelloMain {
	public static void main(String[] args) {		
		//강한 결함		
//		HelloServiceKor helloServiceKor = new HelloServiceKor();
//		String msg = helloServiceKor.helloKor("안효인");
		
		//느슨한 결합		
		HelloServiceEng helloServiceEng = new HelloServiceEng();
		String msg = helloServiceEng.helloEng("안효인");
		
		System.out.println(msg);
		
	}
}
